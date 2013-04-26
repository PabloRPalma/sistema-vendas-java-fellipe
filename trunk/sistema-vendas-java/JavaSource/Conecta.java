import org.hibernate.Session;

import com.fellipe.sistema.vendas.HimernateUtil;


public class Conecta {

	public static void main(String[] args){
		Session sessao = null;
		try{
			sessao = HimernateUtil.getSession().openSession();
			System.out.println("Conectou !");
			
		}finally{
			sessao.close();
			System.out.println("Fechou conexão");
		}
	}
}
