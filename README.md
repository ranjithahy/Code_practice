# Array Partitioning Algorithm

## Problem Statement
Move all non-1 elements to the front of an array, pushing 1s to the back.

## Algorithm
Two-pointer partitioning technique:
- **count**: tracks the boundary for placing non-1 elements
- **i**: iterates through array
- When `arr[i] != 1`, swap with `arr[count]` and increment count

