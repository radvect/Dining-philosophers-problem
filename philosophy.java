public class philosophy{

    public static void main(String[] args){

    Thread first = new Thread(new philosopher(0));
    Thread second = new Thread(new philosopher(1));    
    Thread third = new Thread(new philosopher(2));
    Thread fourth = new Thread(new philosopher(3));
    Thread fifth = new Thread(new philosopher(4));
    first.start();
    second.start();
    third.start();
    fourth.start();
    fifth.start();
    }
    
    


}

class philosopher implements Runnable{
    public int i;
    boolean[] forks = new boolean[]{true,true,true,true,true};
    public philosopher(int i){
        this.i = i;
    }
    
    public void run()
    {while(true){
        switch(i){
            case 0:
            if(forks[0]){
                if(forks[1]){
                    forks[0] = false;
                    forks[1] = false;
                    System.out.println(i+": Кушою" );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(i+": Покушол" );
                    forks[1] = true;
                    forks[0] = true;
                }
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}}
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
                

            
        


            break;
            case 1:
            if(forks[1]){
                if(forks[2]){
                    forks[1] = false;
                    forks[2] = false;
                    System.out.println(i+": Кушою" );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(i+": Покушол" );
                    forks[2] = true;
                    forks[1] = true;
                }
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}}
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            break;
            case 2:
            if(forks[2]){
                if(forks[3]){
                    forks[2] = false;
                    forks[3] = false;
                    System.out.println(i+": Кушою" );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(i+": Покушол" );
                    forks[3] = true;
                    forks[2] = true;
                }
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}}
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            break;
            case 3:
            if(forks[3]){
                if(forks[4]){
                    forks[3] = false;
                    forks[4] = false;
                    System.out.println(i+": Кушою" );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(i+": Покушол" );
                    forks[4] = true;
                    forks[3] = true;
                }
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}}
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            break;
            case 4:
            if(forks[0]){
                if(forks[4]){
                    forks[0] = false;
                    forks[4] = false;
                    System.out.println(i+": Кушою" );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(i+": Покушол" );
                    forks[4] = true;
                    forks[0] = true;
                }
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}}
                else{try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            break;



        }
    }
            


        }


    }
