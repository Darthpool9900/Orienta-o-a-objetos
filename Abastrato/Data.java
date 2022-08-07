
    public class Data{
        private int dia;
        private int mes;
        private int ano;
    
        public Data(int dia,int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    
        public Data(int dia,int mes){
            this.dia = dia;
            this.mes = mes;
        }
    
        public void setDia(int dia){
            if(this.dia <=31){
              this.dia = dia;
            }
        }
        public void setMes(int mes){
            if(this.mes >=1 && this.mes<=12){
            this.mes = mes;
            }
        }
    
        public void setAno(int ano){
            if(this.ano>=1922){
                this.ano = ano;
            }
        }
    
    
        public int getdia(){
                return dia;
        }
    
        public int getmes(){
                return mes;
        }
        public int getano(){
                return ano;
        }
    
        public String toString(){
            String temp = dia+"/ "+mes+"/"+ano;
            return temp;
        }
    }
