package LeetCode;

public class Medium2120 {
    public static void main(String[] args) {

        long m=System.currentTimeMillis();
        long time = System.nanoTime();

        int n=3;
        int[] startPos={0,1};
        int[] arr=new int[]{startPos[0],startPos[1]};
        String s="RRDDLU";

        int[] answer=new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            int sum=0;
            startPos[0]=arr[0];
            startPos[1]=arr[1];
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'R') startPos[1] = startPos[1] + 1;
                if (s.charAt(j) == 'L') startPos[1] = startPos[1] - 1;
                if (s.charAt(j) == 'D') startPos[0] = startPos[0] + 1;
                if (s.charAt(j) == 'U') startPos[0] = startPos[0] - 1;

                if (startPos[0] >= 0 && startPos[1] >= 0 && startPos[0] < n && startPos[1] < n) sum++;
                else break;
            }
            System.out.println(sum);
        }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);

        System.out.println(System.currentTimeMillis()-m);
    }
}
