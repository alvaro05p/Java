import java.util.Scanner;

public class tresEnRaya{
    public static void main(String[] args) throws InterruptedException {
 
        Scanner sc = new Scanner (System.in);

        char[][]  matriz = new char[3][3];
        int x=1;
        int y=1;
        int bot=0;
        boolean loop = true;
        boolean winner = true;
        boolean game = true;
        //bot = (int) (Math.floor(Math.random()*(1-9+1)+9));
       
        

        

        while (game){

            
            System.out.print("En que casilla? ");
            int usuario=sc.nextInt();
            System.out.print("\033[H\033[2J");
            
            
            x=1;
            for (int i=0;i<3;i++){

               
                System.out.println(" -----------");

                for (int j=0;j<3;j++){
                
                    
                    
                    if(x==usuario){

                        matriz[i][j]='x';

                    }

                    System.out.print(" ");
                    System.out.print("|"+matriz[i][j]+"|");
                    x++;
                    
                    
                }

                System.out.println("");

                
            
            }
            Thread.sleep(1000);            
           
            //Bot contra el que jugamos

            loop=true;

            while (loop){

                System.out.print("\033[H\033[2J");
                bot = (int) (Math.floor(Math.random()*(0-9+0)+9));
                y=1;
                for (int i=0;i<3;i++){

                
                    System.out.println(" -----------");

                    for (int j=0;j<3;j++){
                    
                        
                        if(bot==y && matriz[i][j] != 'x' && matriz[i][j] != '0'){

                            matriz[i][j]='0';
                            loop=false;

                        }    

                        System.out.print(" ");
                        System.out.print("|"+matriz[i][j]+"|");
                        y++;
                        
                        
                    }

                    System.out.println("");

                }

                

            }
            
            
        //Algoritmo para saber el ganador/empate
            winner=true;
        
            while(winner){

               for (int w=0;w<3;w++){

                    

                    //Filas

                    if(matriz[w][0] == 'x' && matriz [w][1] == 'x' && matriz [w][2] == 'x'){

                        System.out.println("Gana el usuario");
                        game=false;
                        winner = false;

                    }

                    if(matriz[w][0] == 'x' && matriz [w][1] == 'x' && matriz [w][2] == 'x'){

                        System.out.println("Gana el usuario");
                        game=false;
                        winner = false;

                    }



                    //Columnas

                    if(matriz[0][w] == '0' && matriz [1][w] == '0' && matriz [2][w] == '0'){

                        System.out.println("Gana el bot");
                        game=false;
                        winner = false;

                    }

                    //Diagonales

                    if(matriz[0][0] == 'x' && matriz [1][1] == 'x' && matriz [2][2] == 'x'){

                        System.out.println("Gana el usuario");
                        game=false;
                        winner = false;

                    }

                    if(matriz[0][0] == '0' && matriz [1][1] == '0' && matriz [2][2] == '0'){
                        System.out.println("Gana el bot");
                        game=false;
                        winner = false;

                    }

                    if(matriz[2][0] == 'x' && matriz [1][1] == 'x' && matriz [0][2] == 'x'){

                        System.out.println("Gana el usuario");
                        game=false;
                        winner = false;

                    }

                    if(matriz[2][0] == '0' && matriz [1][1] == '0' && matriz [0][2] == '0'){
                       
                        System.out.println("Gana el bot");
                        game=false;
                        winner = false;
                   
                    }


               }

                winner = false;
            
            }
                

        }


    }

}