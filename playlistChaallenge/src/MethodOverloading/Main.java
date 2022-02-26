package MethodOverloading;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer","Deep purple");
        album.addSong("StormBringer",4.6);
        album.addSong("Love don't mean a thing",4.3);
        album.addSong("Holy man",4.2);
        album.addSong("Hold on",4.10);
        album.addSong("Lady double dealer",3.21);
        album.addSong("You can't do it right",7.1);
        album.addSong("High ball shooter",4.13);
        album.addSong("The gypsy",4.15);
        album.addSong("Solider of fortune",2.6);
        albums.add(album);
        album = new Album("For those about to rocvk","AC/DC");
        album.addSong("For those about to rock",3.1);
        album.addSong("Tomato town",3.2);
        album.addSong("Ham king",5.8);
        album.addSong("Sister fister",6.7);
        album.addSong("linx",3.5);
        album.addSong("Ham and turkey",7.1);
        album.addSong("Rage",2.7);
        album.addSong("Rick",4.12);
        album.addSong("Flick" ,4.10);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right",playList);
        albums.get(0).addToPlayList("Holy man",playList);
        albums.get(0).addToPlayList("Swinger",playList);
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);
        play(playList);




    }
    private static  void play(LinkedList<Song> playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playlist");
            return;
        }
        else {
            System.out.println("Now playing " +listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the ned of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.hasPrevious();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;

                        }else{
                            System.out.println("We have reached he end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " +listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0-to quit\n" +
                "1 - to play next song\n"+
                "2 - to go to previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions.\n"+
                "6 - Remove a song from the playlist");


    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("+++++++++++++++++++++++");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("+++++++++++++++++++++++");
    }

}
