import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }
    public void adicionarPessoa(String nome, int idade, double altura, int i){
        pessoaList.add(new Pessoa(nome, idade, altura));


    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa>pessoasPorIdade= new ArrayList<>(pessoaList);
        Collections.sort((pessoasPorIdade));
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa>pessoasPorAltura= new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa= new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1",25, 1,30);
        ordenacaoPessoa.adicionarPessoa("Nome 2",24, 1,10);
        ordenacaoPessoa.adicionarPessoa("Nome 3",21, 1,50);
        ordenacaoPessoa.adicionarPessoa("Nome 4",22, 1,60);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

