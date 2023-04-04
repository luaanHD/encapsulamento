public class Cliente {
    
    public static void main(String[] args) {
        
        Conta conta=new Conta();
        conta.setNumero(392);

        conta.setSalario(13000);

        conta.setNome("Luan Toniolo");

        System.out.println(conta.getNumero());
        System.out.println(conta.getSalario());
        System.out.println(conta.getNome());

        // conta.nome="Luan";
        // conta.salario=10000;

        // System.out.println(conta.nome);
        // System.out.println(conta.salario);
    }
}
