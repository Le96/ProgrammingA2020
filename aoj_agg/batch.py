#!/usr/bin/env python3

import csv

from tqdm import tqdm

import aggregator
import const


def main() -> None:
    data = parse_csv()
    accepted = aggregate(data)
    score = {}
    for k, v in accepted.items():
        score[k] = calc_score(v)
    for k, v in score.items():
        print(k, v)


def calc_score(accepted_problems: list) -> int:
    score_list = const.SCORE_LIST
    score = 0
    for score_dict in score_list:
        for k, v in score_dict.items():
            # only scoring problem for beginner.
            # if k != 1:
            #     continue
            for problem in v:
                if problem in accepted_problems:
                    score += k
    return score


def parse_csv() -> list:
    csv_data = []
    # Download it from Waseda Moodle.
    with open('./Aizu_Online_Judge_.csv', 'r') as csv_fp:
        csv_reader = csv.DictReader(csv_fp)
        for line in csv_reader:
            csv_data.append(line)
    return csv_data


def aggregate(data) -> list:
    result = {}
    for line in tqdm(data):
        user_name = line['フルネーム']
        user_id = line['Q01_アカウント名']
        user_id = user_id.split('=')[-1] if '=' in user_id else user_id
        accepted = aggregator.main(user_id)
        result[user_name] = accepted
    return result


if __name__ == '__main__':
    main()
