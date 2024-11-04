# Identity Matrix Checker

This Java program checks if a series of square matrices are identity matrices. An **identity matrix** is a square matrix where all elements on the main diagonal are `1` and all other elements are `0`. The program reads multiple matrices from input, checks each for the identity matrix property, and outputs `"SI"` if the matrix is an identity matrix and `"NO"` otherwise.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Usage](#usage)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)

---

## Overview

The program reads the dimensions of each matrix and its elements, then verifies if it is an identity matrix. It uses a simple method to check both diagonal and non-diagonal elements to confirm the identity matrix property.

## Purpose

This project is a **learning exercise** aimed at practicing:
- Working with multi-dimensional arrays.
- Loop control and nested loops.
- Boolean flagging for conditional checks within matrix validation.

## Features

- **Identity Matrix Validation**: Determines if each input matrix meets the identity matrix conditions.
- **Flexible Input Handling**: Allows for multiple matrices to be input sequentially.
- **Simple Output**: Prints `"SI"` if the matrix is an identity matrix and `"NO"` otherwise.

### Input Format

For each matrix:
1. Enter a single integer `N`, the size of the matrix (N x N).
2. Enter each element of the matrix row-by-row.
3. Repeat or enter `0` to end.

Example:
```plaintext
3
1 0 0
0 1 0
0 0 1
2
1 0
0 1
0
```

### Output

The program outputs `"SI"` if the matrix is an identity matrix, and `"NO"` otherwise.

## Example Input and Output

### Input

```plaintext
3
1 0 0
0 1 0
0 0 1
3
1 0 1
0 1 0
0 0 1
2
1 0
0 1
0
```

### Output

```plaintext
SI
NO
SI
```

## Explanation

The program checks each matrix for the identity matrix property by:
1. Ensuring all diagonal elements are `1`.
2. Ensuring all non-diagonal elements are `0`.

For each matrix:
- If all conditions are met, it outputs `"SI"`.
- If any condition fails, it outputs `"NO"`.

### Optimized Approach

An alternative version of this program uses a `boolean` flag (`esIdentidad`) to check conditions without prematurely breaking the loops. This ensures all elements are read, which is especially useful in structured input scenarios.