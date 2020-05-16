package rabestro.visitor;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

// My code starts here

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private static final int MODULO = 1_000_000_000 + 7;
    private long product = 1;

    public int getResult() {
        return product > 0 ? (int) product : 1;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product *= node.getValue();
            product %= MODULO;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product *= leaf.getValue();
            product %= MODULO;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int sumInNodes = 0;
    private int sumInGreen = 0;

    public int getResult() {
        return Math.abs(sumInNodes - sumInGreen);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            sumInNodes += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            sumInGreen += leaf.getValue();
        }
    }
}

final class Node {
    private Color color;
    private final int value;
    private final Set<Integer> edges = new HashSet<>();

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color == 0 ? Color.RED : Color.GREEN;
    }

    void addEdge(int id) {
        edges.add(id);
    }

    Set<Integer> getEdges() {
        return edges;
    }
}

public class Solution {
    private static Node[] nodes;

    private static void createNode(TreeNode parent, Integer id) {
        final Set<Integer> nodeEdges = nodes[id].getEdges();
        final boolean isLeaf = nodeEdges.isEmpty();
        if (isLeaf) {
            parent.addChild(new TreeLeaf(nodes[id].getValue(), nodes[id].getColor(), parent.getDepth() + 1));
            return;
        }
        final TreeNode node = new TreeNode(nodes[id].getValue(), nodes[id].getColor(), parent.getDepth() + 1);
        parent.addChild(node);
        for (Integer childId : nodeEdges) {
            nodes[childId].getEdges().remove(id);
            createNode(node, childId);
        }
    }

    public static Tree solve() {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        nodes = new Node[n];

        for (int i = 0; i < n; ++i) {
            nodes[i] = new Node(sc.nextInt());
        }
        for (int i = 0; i < n; ++i) {
            nodes[i].setColor(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            final int u = sc.nextInt() - 1;
            final int v = sc.nextInt() - 1;
            nodes[u].addEdge(v);
            nodes[v].addEdge(u);
        }

        final TreeNode root = new TreeNode(nodes[0].getValue(), nodes[0].getColor(), 0);
        final Set<Integer> rootEdges = nodes[0].getEdges();

        for (Integer id : rootEdges) {
            nodes[id].getEdges().remove(0);
            createNode(root, id);
        }
        return root;
    }
    
    // End of my code
    
    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
