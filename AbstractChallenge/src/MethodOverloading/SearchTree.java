package MethodOverloading;

public class SearchTree implements NodeList{
    private  ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = item;
        while(currentItem!=null){
            int comparison = (currentItem.compareTo(item));
            if(comparison<0){
                if(currentItem.next()!=null){
                    //item is greater, move right if possible
                    currentItem = currentItem.next();
                }else{
                    //there's no node to the right, so add at this point
                    currentItem.setNext(item);
                    return true;
                }

            }else if(comparison>0){
                //newItem is less, move left is possible
                if(currentItem.previous()!=null){
                    currentItem = currentItem.previous();
                }else{
                    //there's no ndoe to the left, so add at this point
                    currentItem.setNext(item);
                    return true;
                }

            }else{
                //equal,so don't add
                System.out.println(item.getValue() + " already exist");
                return false;


            }


        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root!=null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());

        }

//        if(root!=null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }

    }
}
