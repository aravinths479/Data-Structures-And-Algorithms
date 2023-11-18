def generate_non_adjacent_subsequences(arr, current=[], index=0):
    if index == len(arr):
        # Base case: When we reach the end of the array, print the current subsequence
        print(current)
        return

    # Exclude the current element and continue with the next index
    generate_non_adjacent_subsequences(arr, current, index + 1)

    # Include the current element and continue with the next index after skipping the next element
    generate_non_adjacent_subsequences(arr, current + [arr[index]], index + 2)

# Example usage:
my_array = [1, 2, 3]
generate_non_adjacent_subsequences(my_array)
