package Lesson.L11_Tree;

public class Tree1 {
    public static void main(String[] args) {
        Tree root = new Tree(20,
                new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));
        System.out.println(sumRecursive(root));
        System.out.println(root.sum());
    }


    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sum() {
            int summ = value;
            if (left != null) summ += left.sum();
            if (right != null) summ += right.sum();
            return summ;
        }

        }
    public static int sumRecursive(Tree root) {
        int sum = root.value;
        if (root.left != null) sum += sumRecursive(root.left);
        if (root.right != null) sum += sumRecursive(root.right);
        return sum;
    }
}
