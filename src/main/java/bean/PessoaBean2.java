package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

import model.Pessoa2;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean2 {

	 private List<Pessoa2> pessoas =
	         new ArrayList<Pessoa2>();

	         public PessoaBean2() {
	               for (int i = 0; i < 20; i++) {
	                      pessoas.add(generateRandomPessoa());
	               }
	         }

	         public String [] nomes = {"Eduardo", "Luiz",
	         "Henrique", "Felipe", "Bruna", "Brianda", "Sonia"};

	         public List<Pessoa2> getPessoas() {
	               return pessoas;
	         }

	         public Pessoa2 generateRandomPessoa() {

	               int indice = (int) Math.floor(Math.random()*7);
	               Pessoa2 pessoa = new Pessoa2();
	               pessoa.setNome(nomes[indice]);
	               pessoa.setEmail("E-mail " + indice);
	               pessoa.setTelefone(null);
	               pessoa.setCpf("CPF");

	               return pessoa;

	         }
	

}
