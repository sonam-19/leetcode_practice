class Solution {
  public int bagOfTokensScore(int[] tokens, int point) {
    Arrays.sort(tokens);
    ArrayDeque<Integer> queue = new ArrayDeque<>(Arrays.stream(tokens).boxed().collect(Collectors.toList()));

    int score = 0;

    while (queue.size() > 1) {
      // without changed, forever loop
      boolean changed = false;
      // bugs: missing !queue.isEmpty(), >= not >
      while (!queue.isEmpty() && point >= queue.peekFirst()) {
        score++;
        point -= queue.removeFirst();
        changed = true;
      }

      if (score > 0 && queue.size() > 1) {
        score--;
        point += queue.removeLast();
        changed = true;
      }
      if (!changed)
        break;
    }

    if (!queue.isEmpty() && point > queue.peekFirst()) {
      score++;
    }
    return score;
  }
}