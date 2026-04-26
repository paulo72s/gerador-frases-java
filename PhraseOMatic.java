import java.util.Random;
public class PhraseOMatic{
    public static void main ( String[]  args){
String [] wordListOne = {" Paulo ", " Vinicius", "Gabriel", "Joaozinho", "Negopreto", "ClaraMLK", "ClaraKlayver", "Klayver"};
String [] wordListTwo = {"Medico", "Bombeiro", "Policial", "Carpiteiro", "Caixa mercado", "ASG", "Desempregado", "Arquiteto" };
String [] wordListThree = { "Pobre", "Rico","Pobre", "Rico","Pobre", "Rico","Pobre", "Rico", };

 int oneLength = wordListOne.length;
 int twoLength = wordListTwo.length;
 int threeLength = wordListThree.length;

 Random randomGenerator = new Random();

  int rand1 = randomGenerator.nextInt(oneLength);
  int rand2 = randomGenerator.nextInt(twoLength);
  int rand3 = randomGenerator.nextInt(threeLength);

  String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
  System.out.println(" " + phrase);


}    
}
