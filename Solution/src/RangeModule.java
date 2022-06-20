public class RangeModule {
    public TreeNode tree;

    public void addRange(int left, int right) {
        if (tree == null) {
            tree = new TreeNode(left, right);
        } else {
            tree.insert(left, right);
        }

    }

    public boolean queryRange(int left, int right) {
        if (tree == null) {
            return false;
        }
        return tree.find(left, right);
    }

    public void removeRange(int left, int right) {
        if (tree != null) {
            tree = tree.remove(left, right);
        }
    }

    private static class TreeNode {
        public int left, right;
        public TreeNode leftc, rightc;

        public TreeNode(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public void insert(int left, int right) {
            if (left >= this.left && right <= this.right) {
                return;
            } else if (right <= this.left) {
                if (leftc == null) {
                    leftc = new TreeNode(left, right);
                } else {
                    leftc.insert(left, right);
                }

            } else if (left <= this.left && right <= this.right) {
                if (leftc == null) {
                    leftc = new TreeNode(left, this.left);
                } else {
                    leftc.insert(left, this.left);
                }
            } else if (left >= this.left && left < this.right) {
                if (rightc == null) {
                    rightc = new TreeNode(this.right, right);
                } else {
                    rightc.insert(this.right, right);
                }
            } else if (left >= this.right) {
                if (rightc == null) {
                    rightc = new TreeNode(left, right);
                } else {
                    rightc.insert(left, right);
                }
            } else {
                if (leftc == null) {
                    leftc = new TreeNode(left, this.left);
                } else {
                    leftc.insert(left, this.left);
                }

                if (rightc == null) {
                    rightc = new TreeNode(this.right, right);
                } else {
                    rightc.insert(this.right, right);
                }
            }
        }

        public boolean find(int left, int right) {
            if (left >= this.left && right <= this.right) {
                return true;
            } else if (right <= this.left) {
                if (leftc == null) return false;
                return leftc.find(left, right);
            } else if (left <= this.left && right <= this.right) {
                if (leftc == null) return false;
                return leftc.find(left, this.left);
            } else if (left >= this.left && left < this.right) {
                if (rightc == null) return false;
                return rightc.find(this.right, right);
            } else if (left >= this.right) {
                if (rightc == null) return false;
                return rightc.find(left, right);
            } else {
                if (rightc == null || leftc == null) return false;
                return leftc.find(left, this.left) && rightc.find(this.right, right);
            }
        }

        public TreeNode remove(int left, int right) {
            if (left >= this.left && right <= this.right) {
                TreeNode parent = new TreeNode(this.left, left),
                        rightchild = new TreeNode(right, this.right);
                parent.leftc = leftc;
                parent.rightc = rightchild;
                rightchild.rightc = rightc;
                return parent;
            } else if (right <= this.left) {
                if (leftc != null) {
                    leftc = leftc.remove(left, right);
                }

                return this;
            } else if (left <= this.left && right <= this.right) {
                this.left = right;
                if (leftc != null)
                    leftc = leftc.remove(left, right);
                return this;
            } else if (left >= this.left && left < this.right) {
                this.right = left;
                if (rightc != null)
                    rightc = rightc.remove(left, right);
                return this;
            } else if (left >= this.right) {
                if (rightc != null)
                    rightc = rightc.remove(left, right);
                return this;
            } else {
                TreeNode l, r;
                if (leftc == null) {
                    l = null;
                } else {
                    l = leftc.remove(left, right);
                }
                if (rightc == null) {
                    r = null;
                } else {
                    r = rightc.remove(left, right);
                }
                if (l == null && r == null) {
                    return null;
                } else if (l == null) {
                    return r;
                } else if (r == null) {
                    return l;
                } else {
                    if (l.rightc == null) {
                        l.rightc = r;
                    } else {
                        TreeNode rightest = l;
                        while (rightest.rightc != null)
                            rightest = rightest.rightc;
                        rightest.rightc = r;
                    }
                    return l;
                }
            }
        }
    }
}