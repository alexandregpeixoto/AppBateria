package src;

/**
 * Created by alexa on 19/09/2017.
 */

public enum sonsBateria {
    Bombo2("Bombo 2", 35),
    Bombo1("Bombo 1", 36),
    ToqueAro("Batida no Aro", 37),
    Tarola1("Tarola 1 Pele", 38),
    Palmas("Palmas", 39),
    Tarola2("Tarola 2 Aro", 40),
    TimbalaoGrave2("Timbalão grave 2", 41),
    PratosChoqueFechado1("Pratos de choque fechados", 42),
    TimbalaoGrave1("Timbalão grave 1", 43),
    PratosChoqueFechado2("Pratos de choque fechados pedal", 44),
    TimbalaoMedio2("Timbalão médio 2", 45),
    PratosChoqueAberto1("Pratos de choque abertos", 46),
    TimbalaoMedio1("Timbalão médio 1", 47),
    TimbalaAgudo2("Timbalão agudo 2", 48),
    PratoAtaque("Prato de ataque crash 1", 49),
    TimbalaAgudo1("Timbalão agudo 1", 50),
    PratoConducao1("Prato de condução 1", 51),
    PratoChina("Prato de ataque china", 52),
    PratoConducao("Prato de condução", 53),
    Pandeirola("Pandeirola", 54),
    PratoSplash("Prato de ataque splash", 55),
    Caneca("Caneca", 56),
    PratoCrash2("Prato de ataque crash 2", 57),
    Vibraslap("Vibraslap", 58),
    PratoConducao2("Prato de condução 2", 59),
    BongoAgudo("Bongo agudo", 60),
    BongoGrave("Bongo grave", 61),
    CongaAgudaAbafada("Conga aguda abafada", 62),
    CongaAguda("Conga aguda", 63),
    CongaGrave("Conga grave", 64),
    TimbaleAgudo("Timbale agudo", 65),
    TimbaleGrave("Timbale grave", 66),
    Agogo("Agogô", 67),
    AgogoGrave("Agogô grave", 68),
    Afoxe("Afoxé", 69),
    Maracas("Maracas", 70),
    ApitoCurto("Apito curto", 71),
    ApitoLongo("Apito longo", 72),
    RecoRecoCurto("Reco-reco curto", 73),
    RecoRecoLongo("Reco-reco longo", 74),
    Clavas("Clavas", 75),
    BlocoMadeiraAgudo("Bloco de madeira agudo", 76),
    BlocoMadeiraGrave("Bloco de madeira grave", 77),
    CuicaAbafada("Cuíca abafada", 78),
    Cuica("Cuíca", 79),
    TrianguloAbafado("Triângulo abafado", 80),
    Triangulo("Triângulo", 81);

    private String nome;
    private int codigoMIDI;

    private sonsBateria(String nome, int codigoMIDI) {
        this.nome = nome;
        this.codigoMIDI = codigoMIDI;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoMIDI() {
        return codigoMIDI;
    }

    public int valorSom;
    sonsBateria(int valor) {
        valorSom = valor;
    }
}