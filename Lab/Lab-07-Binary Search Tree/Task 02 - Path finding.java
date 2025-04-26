public static String findPath(Node root, Integer key ){
        ArrayList<Integer> path = new ArrayList<>();
        if(findpath(root,key,path)==true){
            return "Path : " + path;
        }
        else{
            return "No Path Found";
        }
    }
    public static boolean findpath(Node root,int key,ArrayList<Integer> route){
        if(root==null){
            return false;
        }
        route.add(root.elem);
        if(root.elem==key){
            return true;
        }
        if((root.elem>key && findpath(root.left,key,route)) || (root.elem<key && findpath(root.right,key,route))){
            return true;
        }
        route.remove(route.size()-1);
        return false; 
    }
