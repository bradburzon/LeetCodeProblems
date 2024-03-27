import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            collision: {
                while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                    if (-asteroid > stack.peek()) {
                        stack.pop();
                        continue;
                    } else if (-asteroid == stack.peek()) {
                        stack.pop();
                    }

                    break collision;
                }
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}