
/**
 * Escreva a descrição da classe EncEficiente aqui.
 *
 * @author (seu nome)
 * @version (número de versão ou data)
 */
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Iterator;


public class EncEficiente
{
    private String nome;
    private  int nif;
    private String morada;
    private int codigo;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> linhas ;


    public EncEficiente ()
    {
        this.nome="";
        this.nif=0;
        this.morada="";
        this.codigo=0;
        this.data=LocalDate.now();
        this.linhas= new ArrayList<LinhaEncomenda>();
    }
    public EncEficiente( String n, int nf, String mor, int cod, LocalDate dat, ArrayList<LinhaEncomenda> le )
    {
        this.linhas= new ArrayList<LinhaEncomenda> (le.size());
        this.nome=n;
        this.nif=nf;
        this.morada=mor;
        this.codigo=cod;
        this.data= dat;
        for ( LinhaEncomenda l : le)
        {
            this.linhas.add(l.clone());
        }
    }


    public void setnome( String n)
    {
        this.nome=n;
    }
    public void setnif( int nf)
    {
        this.nif=nf;
    }
    public void setmorada( String mrd)
    {
        this.morada=mrd;
    }
    public void setcodigo( int cod)
    {
        this.codigo=cod;
    }
    public void setdata( LocalDate dt)
    {
        this.data=dt;
    }
    public void setlinhas( ArrayList<LinhaEncomenda> le)
    {
        this.linhas= new ArrayList<LinhaEncomenda> (le.size());
        for ( LinhaEncomenda l: le)
        {
            this.linhas.add(l.clone());
        }
    }

    public String getnome(){}
    public int getnif(){}
    public String getmorada(){}
    public int getcodigo(){}
    public Localdate getdata(){}
    public ArrayList<LinhaEncomenda> getlinhas(){}
}
Cenas
