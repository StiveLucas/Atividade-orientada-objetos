public class camisa {

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
    public void setCor(){
        this.cor = cor;

    }
    
    //Acessador
    public double getTamanho(){
        return tamanho;

    }

    //Modificador
    public void setTamanho(){
        this.tamanho = tamanho;

    }

    //Acessador
    public String getTipo(){
        return tipo;
    }

    //Modificador
    public void setTipo(){
        this.tipo = tipo;
    }


}