def get_multiple_counts(input):
    counts = {1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0}
    for num in input:
        for factor in counts.keys():
            if num % factor == 0:
                counts[factor] += 1
    return counts

input = [1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]
output = get_multiple_counts(input)
print(output)
