package Lotto;

public class Lottoac {

	public static void main(String[] args) {
    public void execute() {
               ComLotto c = new ComLotto();
               UserLotto u = new UserLotto();

               c.execute();
               System.out.println();
               u.execute();

               int[] ComLotto = c.ComLotto;
               int[] userLotto = u.userLotto;

               int count=0;

               for(int i=0; i<comLotto.length; i++) {

                       for(int j=0; j<userLotto.length; j++) {
                              if(comLotto[i]==userLotto[j])

                                      count++;

                       }

               }

              

               String msg = "";           

               switch(count) {

 

                       case 3:

                              msg = "4등입니다! 5000원 당첨!";

                              break;

                       case 4:

                              msg = "3등입니다! 5만원 당첨!";

                              break;

                       case 5:

                              msg = "2등입니다! 200만원 당첨!";

                              break;

                       case 6:

                              msg = "1등입니다! 12억원 당첨!";

                              break;

                       default:

                              msg = "꽝!!!";      

                                                    

               }//end switch

               System.out.println(msg);
               }}