1class Solution:
2    def convert(self, s: str, numRows: int) -> str:
3        if numRows == 1 or numRows >= len(s):
4            return s
5
6        rows = [""] * numRows
7        currRow = 0
8        direction = -1
9
10        for ch in s:
11            rows[currRow] += ch
12
13            if currRow == 0 or currRow == numRows - 1:
14                direction *= -1
15
16            currRow += direction
17
18        return "".join(rows)
19        
20