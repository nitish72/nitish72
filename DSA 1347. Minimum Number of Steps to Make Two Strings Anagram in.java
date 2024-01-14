// Date: 13th Jan 2024
//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 int[] count = new int[26];

    for (final char c : s.toCharArray())
      ++count[c - 'a'];

    for (final char c : t.toCharArray())
      --count[c - 'a'];

    return Arrays.stream(count).map(Math::abs).sum() / 2;
