import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgram {
    public static void main(String[] args) {

        //demonstrate of a series of blocks in a chain

        ArrayList<Block> blockchain = new ArrayList<>();

        String[] intialValues ={
                "shad has 700$",
                "Miguel has $550"
        };

        Block firstBlock = new Block(intialValues, 0);
        blockchain.add(firstBlock);
        System.out.printf("First Block is " + firstBlock.toString()  + "\n");
        System.out.printf("The Blockchain is " + blockchain.toString()  + "\n");


        //second block
        String[] shadGivesItAway ={
                "shad gives Tim 70$",
                "shad gives M 50$",
                "shad gives Ben 60$",
        };

        Block secongBlock = new Block(shadGivesItAway, firstBlock.getBlockHash());
        blockchain.add(secongBlock);
        System.out.printf("Second Block is " + secongBlock.toString() + "\n");
        System.out.printf("The Blockchain is " + blockchain.toString()  + "\n");



    }
}
