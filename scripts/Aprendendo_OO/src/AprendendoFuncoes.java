//exibir mensagem
import javax.accessibility.AccessibleState;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog; //
static java.lang.Integer.parseInt;
//receber dados do usuario
import static 
    javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class AprendendoFuncoes{
    public static void main(String[] args) {
        int resultado=calculaSoma(3,5);
        showMessageDialog(null, resultado);
    }//main
    
    //funcao para somar 2 numeros[int]: [int]
    public static int calculaSoma(int num1, int num2){
        int n1= parseInt(showInputDialog("DIGITE n1"));
        int result= num1+num2;
    return result;
    
    }
}//class