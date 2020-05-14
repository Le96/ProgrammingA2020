#!/usr/bin/env python3

import csv

import aggregator


def main() -> None:
    data = parse_csv()
    accepted = aggregate(data)
    print(accepted)


def parse_csv() -> dict:
    csv_dict = csv.DictReader(open('./Aizu_Online_Judge_.csv', 'r'))
    return csv_dict


def aggregate(data) -> dict:
    result = {}
    for line in data:
        user_name = line['フルネーム']
        user_id = line['Q01_アカウント名']
        user_id = user_id.split('=')[-1] if '=' in user_id else user_id
        accepted = aggregator.main(user_id)
        result[user_name] = accepted
    return result


if __name__ == '__main__':
    main()
