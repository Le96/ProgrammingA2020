#!/usr/bin/env python3

import requests
import sys
import xml.etree.ElementTree as ET


URL = 'http://judge.u-aizu.ac.jp/onlinejudge/webservice/status_log?user_id='


def main(user_id: str) -> list:
    xml = requests.get(URL + user_id).text
    elements = ET.fromstring(xml)

    accepted = []
    for item in elements:
        problem_id = item.find('.//problem_id').text.strip()
        status = item.find('.//status').text.strip()
        if 'Accepted' in status:
            accepted.append(problem_id)
    return sorted(list(set(accepted)))


if __name__ == '__main__':
    if sys.argv and 2 <= len(sys.argv):
        for user_id in sys.argv[1:]:
            print(user_id, main(user_id))
    else:
        print('[!]', 'Please input AOJ user id.', file=sys.stderr)
