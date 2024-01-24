package CodeForces.Level_B;

import java.util.Scanner;

public class B_158 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k1=0, k2=0, k3=0, k4=0;
        int sum=0;
        int k3k1=0, k2k2=0, k1k1=0, ostk1=0;

        for (int i=0; i<n; i++){
            int s=scan.nextInt();
            if (s==1) k1++;
            if (s==2) k2++;
            if (s==3) k3++;
            if (s==4) k4++;
            if (k1>0 && k3>0){
               k3k1++;
               k3--;
               k1--;
            }
            if (k2==2) {
                k2k2++;
                k2=0;
            }
        }
        for (int i=0; i<n; i++){
            if (k2>0 && k1>0){
                k3++;
                k2--;
                k1--;
            }
            if (k3>0 && k1>0){
                k3k1++;
                k3--;
                k1--;
            }
            if (k2==0 || k1==0) break;
        }
        if (k1%4!=0) ostk1=1;
        for (int i=0; i<n; i++){
            if (k1>3) {
                int k1k1no;
                k1k1no=k1/4;
                k1k1+=k1k1no;
                k1=k1%4;
            }
            if (k1<4) break;
        }
        sum=k4+k3k1+k2k2+k1k1+k3+k2+ostk1;
        System.out.println(sum);
    }
}
    /*int n= scan.nextInt();
    int[] s=new int[n];
    int k4=0;
    int k3k1=0;
    int k2k2=0;
    int k1k1=0;
    int sum=0;
    int k=0;
    int sumArr=0;

        for (int i=0; i<n; i++){
        s[i]= scan.nextInt();
        if (s[i]==4) {
        k4++;
        s[i]=0;
        }
        }
        for (int i3=0; i3<n; i3++){
        for (int i1=0; i1<n; i1++) {
        if (s[i3]==3 && s[i1]==1) {
        k3k1++;
        s[i3]=0;
        s[i1]=0;
        }
        }
        }
        for (int i2=0; i2<n-1; i2++) {
        for (int i22=i2+1; i22<n; i22++) {
        if (s[i2]==2 && s[i22]==2) {
        k2k2++;
        s[i2] = 0;
        s[i22] = 0;
        }
        }
        }
        for (int i2=0; i2<n; i2++){
        for (int i1=0; i1<n; i1++){
        if (s[i2]==2 && s[i1]==1) {
        s[i2]=3;
        s[i1]=0;
        }
        }
        }
        for (int i3=0; i3<n; i3++){
        for (int i1=0; i1<n; i1++) {
        if (s[i3]==3 && s[i1]==1) {
        k3k1++;
        s[i3]=0;
        s[i1]=0;
        }
        }
        }
        for (int i1=0; i1<n-1; i1++){
        for (int j1=i1+1; j1<n; j1++) {
        if (s[i1] == 1 && s[j1]==1) {
        k+=2;
        s[i1]=0;
        s[j1]=0;
        }
        }
        }
        if (k>0 && k<=4) k1k1++;
        else if (k>4 && k%4 != 0) k1k1=k/4+1;
        else if (k>4 && k%4 == 0) k1k1=k/4;

        for (int i=0; i<n; i++){
        if (s[i]>0) sumArr++;
        }
        sum=sumArr+k4+k3k1+k2k2+k1k1;
        System.out.println(sum);*/