
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.208817D1-B5CF-1111-B3C4-EE149FA35D95]
// </editor-fold> 
public class Endereco {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C783DE5-7015-2FF1-4B3F-020C51930E74]
    // </editor-fold> 
    private String rua;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8FEBC223-21BF-2B63-841A-963ED00911B2]
    // </editor-fold> 
    private Integer numero;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6CC8A73E-04BD-8A19-5752-706584723E46]
    // </editor-fold> 
    private Cidade cidade;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.739ED28C-38F2-532A-DE87-9F1CFF602355]
    // </editor-fold> 
    public Endereco () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.05C9FB73-CBF0-F213-B44D-D4172077403C]
    // </editor-fold> 
    public Cidade getCidade () {
        return cidade;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1491BAC6-E856-50FC-0F81-FA383F669E8A]
    // </editor-fold> 
    public void setCidade (Cidade val) {
        this.cidade = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.51205CAC-C1A9-BA74-6988-1343DF544011]
    // </editor-fold> 
    public Integer getNumero () {
        return numero;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1037AF3E-4615-BDAA-1674-B3BD6C080CD2]
    // </editor-fold> 
    public void setNumero (Integer val) {
        this.numero = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.992311D3-631D-1854-839C-DF602F1EC5D4]
    // </editor-fold> 
    public String getRua () {
        return rua;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96A4FEF5-7776-E03B-C637-4CE57E36902F]
    // </editor-fold> 
    public void setRua (String val) {
        this.rua = val;
    }

}

