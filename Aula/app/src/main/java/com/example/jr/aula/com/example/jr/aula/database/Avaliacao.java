
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.50B5CE16-9A9B-3953-0B77-C3A6B6235D3E]
// </editor-fold> 
public class Avaliacao {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.50A94142-79C3-BF7E-8FC5-F7B13D68E471]
    // </editor-fold> 
    private Pessoa pessoa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.10F9E52B-EFE8-9D1C-D241-ECCA691744AE]
    // </editor-fold> 
    private Endereco endereco;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BE22F48E-B67A-2705-D05B-7C2E21E7501E]
    // </editor-fold> 
    private String tipoEstabelecimento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E038A69E-BB42-4A94-0A9E-4C70FE173CB0]
    // </editor-fold> 
    private String avaliacao;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB7E2DBA-E039-A84C-9B98-B48D2B878D7B]
    // </editor-fold> 
    private Double preco;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB4C02C3-F70C-801D-91DA-338FC3737D6D]
    // </editor-fold> 
    private String comentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2A2005B4-AC19-BA35-5469-3E04223986AB]
    // </editor-fold> 
    public Avaliacao () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3339C085-6DB7-7CFA-33CD-E53542254DE5]
    // </editor-fold> 
    public String getAvaliacao () {
        return avaliacao;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8ED056B4-839E-8072-E6A7-641527C0B8B1]
    // </editor-fold> 
    public void setAvaliacao (String val) {
        this.avaliacao = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A6B2870F-8F78-8F92-C927-353CAE74A870]
    // </editor-fold> 
    public String getComentario () {
        return comentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5379D887-CDCF-AB97-3E3D-1FFAEB54D68A]
    // </editor-fold> 
    public void setComentario (String val) {
        this.comentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B2157159-A47E-5D61-C5F1-46F3B8AC2B79]
    // </editor-fold> 
    public Endereco getEndereco () {
        return endereco;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9A2E1782-1A68-5A74-AE75-F1353E6541C8]
    // </editor-fold> 
    public void setEndereco (Endereco val) {
        this.endereco = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5563A57E-8C47-050F-F2AA-68C91CC658E8]
    // </editor-fold> 
    public Pessoa getPessoa () {
        return pessoa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0421D0C1-C8EE-BF13-BE81-0EC526B57384]
    // </editor-fold> 
    public void setPessoa (Pessoa val) {
        this.pessoa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.21CE310E-01DE-5389-597D-C9A6E4095D70]
    // </editor-fold> 
    public Double getPreco () {
        return preco;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.20F7489E-9D20-6336-EC26-06D8C1C550C7]
    // </editor-fold> 
    public void setPreco (Double val) {
        this.preco = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D31E50AE-BDD7-5848-E132-479F50556BB3]
    // </editor-fold> 
    public String getTipoEstabelecimento () {
        return tipoEstabelecimento;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B9BBA904-7743-197D-4FA6-CC687FD6A8C1]
    // </editor-fold> 
    public void setTipoEstabelecimento (String val) {
        this.tipoEstabelecimento = val;
    }

}

