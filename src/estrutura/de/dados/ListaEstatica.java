package estrutura.de.dados;


import java.util.Arrays;

public class ListaEstatica {
    private int list[];
    private int cardianalidade;

    // Métodos Especiais
    public ListaEstatica(int[] lista) {
        this.list = lista;
        this.cardianalidade = 0;
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public int getCardianalidade() {
        return cardianalidade;
    }

    public void setCardianalidade(int cardianalidade) {
        this.cardianalidade = cardianalidade;
    }

    @Override
    public String toString() {
        return "ListaEstatica{" +
                "list=" + Arrays.toString(list) +
                ", cardianalidade=" + cardianalidade +
                '}';
    }

    // Métodos Públicos

    // Verifica se lista está vazia
    // retorna false se esta vazia
    // retorna true se tem elemento/s
    public boolean validList(int list[]) {
        if (cardianalidade < 1 || cardianalidade > list.length) {
            return false;
        } else {
            return true;
        }
    }

    // Verifica se lista tem espaço
    // retorna false se não tem espaço
    // Retorna true se sim tem espaço
    public boolean checkIfThereIsSpaceInTheList(int list[]){
        if (list.length == cardianalidade){
            return false;
        }else {
            return true;
        }
    }

    // Recupera o número de elementos na lista
    // Se list[i] == element Retorna element
    public int elementList(int list[], int element){
        for (int i = 0; i < list.length; i++){
            if (list[i] == element){
                element = list[i];
                return element;
            }
        }
        if (true){
            System.out.println("O elemento não existe na lista");
            return 1;
        }
        return element;
    }

    // Verifica se um determinado elemento está na lista
    public String checkElementInList(int list[], int element){
        String resp;
        for (int i = 0; i < list.length; i++){
            if (list[i] == element){
                resp = "Elemento está na lista!";
                return resp;
            }
        }
        resp = "Elemento não se encontra na lista!";
        return resp;
    }

    // Verifica se uma posição qualquer eastá na lista
    public String checkPositionInList(int list[], int element){
        String resp;
        if (element < 1 || element > cardianalidade) {
            resp = "Posição não está na lista";
            return resp;
        }else {
            resp = "Sim posição está na lista";
        }
        return resp;
    }

    // Recuperar um elemento da lista
    public int retrieveElementFromList(int list[], int element){
        for (int i = 0; i < cardianalidade; i++){
            if (list[i] == element){
                element = list[i];
            }
        }
        return element;
    }

    // Recuperar a posição do elemento na lista
    public int retrievePositionFromList(int list[], int element) {
        int position = 0;
        for (int i = 0; i < cardianalidade; i++) {
            if (element == list[i]){
                position = cardianalidade;
            }
        }
        return position;
    }

    // Inserir um elemento no final da lista
    public void insertEndInTheList(int element){
       list[cardianalidade - 1] = element;
        cardianalidade++;
    }

    // Insere um elemento no inicio da lista
    public void insertStartInTheList(int element){
        for (int i = 0; i < cardianalidade; i++){
            list[i + 1] = i;
        }
        list[0] = element;
        cardianalidade++;
    }

    // Retirar um elemento da lista
    public void removePosition(int position){
        for (int i = position; i < cardianalidade; i++){
            list[i - 1] = list[i];
            cardianalidade--;
        }
    }

    // Exibir os elementos da lista
    public void showElementsList(int list[]){
        for (int i = 0; i < list.length; i++){
            System.out.println("Elemento N°" + (i+1) +": "+ list[i]);
        }
    }
}
