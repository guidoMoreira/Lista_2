package Exe8;

public class MenuIter implements Iterator{
    public String nome;
    public int posicao = 0;
    MenuIter[] itens;
    public MenuIter(String nome) {
        this.nome = nome;
    }

    public MenuIter(MenuIter[] itens) {
        this.itens = itens;
    }

    public MenuIter next() {
        MenuIter menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }
}
