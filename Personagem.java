public class Personagem{
    //atributos (variÃ¡veis)
    String nome;
    private int energia;
    private int fome;
    private int sono;
    private int variaveis;
    private final static int MAX_ENERGIA = 10;
    private final static int MIN_ENERGIA = 0;
    private final static int MAX_FOME = 10;
    private final static int MIN_FOME = 0;
    private final static int MAX_SONO = 10;
    private final static int MIN_SONO = 0;
    //comportamentos (mÃ©todos)
    //-tipo de retorno
    //-nome
    //-lista de parÃ¢metros
    //-corpo
    public Personagem(String nome){
        this();
        this.nome = nome;
    }
    public Personagem(){
        this(MAX_ENERGIA, MIN_FOME, MIN_SONO);
    //int energia = 10;
    //int fome = 0;
    //int sono = 0;
    }
    public Personagem(int energia, int fome, int sono){
        this.energia = energia >= MIN_ENERGIA && energia <= MAX_ENERGIA ? energia : MAX_ENERGIA;
        this.fome = fome >= MIN_FOME && fome <= MAX_FOME ? fome : MIN_FOME;
        this.sono = sono >= MIN_SONO && sono <= MAX_SONO ? sono : MIN_SONO;
        //if (energia >=0 && energia <= 10)
        //    this.energia = energia;
        //if (fome >=0 && fome <=10)
        //    this.fome = fome;
        //if (sono >=0 && sono <=10)
        //    this.sono= sono;
    }
    public int getEnergia(){
        return energia;
    }
    public int getFome(){
        return fome;
    }
    public int getSono(){
        return sono;
    }
    public String getNome(){
        return nome;
    }
    public int getVariaveis;
    public void setEnergia(int energia){
        this.energia = energia;
    }

    void cacar(){
        if (energia >= 2){
        System.out.println(nome + " está caçando...");
        energia = energia - 2;
        // energia = energia - 2
        }
        else{
            System.out.println(nome + " está sem energia para caçar...\n");
            fome = fome + 1 <= 10 ? fome + 1 : 10;
            sono = Math.min(sono + 1, 10);
        }
    }
    void comer(){
        if (fome >= 1){
        System.out.println(nome + " está comendo...");
        energia = energia + 1 <= 10 ? energia + 1 : 10;
        fome--;
        }
        else{
            System.out.println(nome + " está sem fome...\n");
        }
    }
    void dormir(){
        if (sono >= 1){
        System.out.println(nome + " está dormindo...");
        energia = energia + 1 <= 10 ? energia + 1 : 10;
        --sono;
        }
        else{
            System.out.println(nome + " está sem sono...\n");
        }
    fome = fome + 1;
    sono = sono + 1;
    }
    void variaveis(){
        System.out.println("Energia:"+energia);
        System.out.println("Fome:"+fome);
        System.out.println("Sono:"+sono);
    }
}
