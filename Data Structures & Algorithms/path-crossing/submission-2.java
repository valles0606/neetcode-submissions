class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;

        Set<String> paths = new HashSet<>();
        paths.add(0 + "," + 0);

        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            if (c == 'S') y--;
            if (c == 'W') x--;
            if (c == 'E') x++;

            String p = x + "," + y;
            if (paths.contains(p)) return true;

            paths.add(p);
        }

        return false;
    }
}