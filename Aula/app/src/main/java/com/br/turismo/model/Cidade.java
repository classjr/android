package com.br.turismo.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker ">
// #[regen=yes,id=DCE.EBD9E904-DF89-EFB9-1586-5FE311E43CA6]
// </editor-fold> 
public class Cidade {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AEC84EFD-F1B9-802F-FAF2-5F61FF8EA243]
    // </editor-fold> 
    private String nome;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0DEA18A8-9A71-70F0-DFBC-A7ADA63717B6]
    // </editor-fold> 
    private String Estado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5CE451E4-2453-0E4E-8D99-C2FE5F5B76EC]
    // </editor-fold> 
    private String Pais;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.787BB007-1342-84F7-4F31-671F13BE2566]
    // </editor-fold> 
    public Cidade () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.600D7154-6C94-4040-57CF-BC43C3BB968B]
    // </editor-fold> 
    public String getEstado () {
        return Estado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6765745B-3993-792E-92F5-0C24A68CC4DC]
    // </editor-fold> 
    public void setEstado (String val) {
        this.Estado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.09405946-E5A7-8452-E869-FE678D084FD9]
    // </editor-fold> 
    public String getPais () {
        return Pais;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7D090D9-60B1-27CD-F75A-44C81C7C655E]
    // </editor-fold> 
    public void setPais (String val) {
        this.Pais = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.47853D05-8D68-A7EA-D869-0172184BF3E4]
    // </editor-fold> 
    public String getNome () {
        return nome;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.401F1490-8672-34F4-0B9D-F89EE05085C7]
    // </editor-fold> 
    public void setNome (String val) {
        this.nome = val;
    }

}

