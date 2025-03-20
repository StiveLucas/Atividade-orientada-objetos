public class Camisa {

    private String cor;
    private double tamanho;
    private String tipo;

    public Camisa(String cor, double tamanho, String tipo){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;

    }

    //Acessador
    public String getCor(){
        return cor;
    }

    //Modificador
    public void setCor(String cor){
        this.cor = cor;

    }
    
    //Acessador
    public double getTamanho(){
        return tamanho;

    }

    //Modificador
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;

    }

    //Acessador
    public String getTipo(){
        return tipo;
    }

    //Modificador
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return "Cor: "+ cor +" Tamnho: "+tamanho+" Tipo: "+tipo;
    }


}