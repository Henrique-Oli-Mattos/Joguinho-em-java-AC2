
package amorasoftrpg;

import java.util.Scanner;

public class AmoraSoftRPG {

   public static void main(String[] args) {
        int classe;
        String name;
        int quest;
        int HP;
        int dadom;
        int dadoNPC;
        int escolha;
        int boss = 32;
        int diceBoss;
        
        System.out.println("===================================");
        System.out.println("Seja bem-vindo as terras de toyrus");
        System.out.println("===================================");
        System.out.println("");
        
        System.out.println("Escolha uma classe, aventureiro:");
        System.out.println("");
        
        System.out.println("Mago:");
        System.out.println("HP: 15");
        System.out.println("Dano: 1d20 + 5");
        System.out.println("");
        
        System.out.println("Guerreiro:");
        System.out.println("HP: 25");
        System.out.println("Dano: 1d10 + 2");
        System.out.println("");
        
        Scanner read = new Scanner(System.in);
        do{
        System.out.println("Digite 1 para mago e 2 para guerreiro");
        classe = read.nextInt();
        if(classe >=1 && classe <=2){
            break;
             }
        System.out.println("valor invalido, tente novamente");
        }
        while(true);
        
        if(classe == 1){
        HP = 15;
    }
        else{
        HP = 25;
    }
        
        System.out.println("");
        System.out.println("Digite seu nome aventureiro!");
        name = read.next();
        
        do{
        System.out.println("Certo, " + name + " agora escolha uma quest");
        System.out.println("1 - Catelo do mago");
        System.out.println("2 - Masmorra do dragão");
        quest = read.nextInt();
        switch(quest){
            case 1:
                if(classe == 1){
                    System.out.println("");
                    System.out.println("====================================================");
                    System.out.println("Você viaja por horas até encontrar uma enorme torre");
                    System.out.println("Ela se esconde em meio as árvores de uma densa floresta");
                    System.out.println("você conjura uma enorme esfera e lança contra porta.");
                    System.out.println("A porta explode e dentro da torre você vê dois jovens");
                    System.out.println("Os jovens gritam:");
                    System.out.println("Avisem o mestre que o " + name + " retornou!");
                    System.out.println("O primeiro jovem dispara uma esfera em sua direção");
                    dadoNPC = (int) (Math.random() * 21);                                               //d20
                    if(dadoNPC > 10){                                                                   //condição de acerto
                        dadoNPC = (int) (Math.random() * 7);                                            //dano
                    if(dadoNPC == 0){
                        dadoNPC++;
                    }
                    System.out.println("Ele te acerta e causa " + dadoNPC + " de dano");  
                    HP = HP - dadoNPC;
                    }
                    else{
                        System.out.println("ele erra!");
                    }
                    System.out.println("Digite 1 para atacar e 2 para fugir");
                    escolha = read.nextInt();
                    switch(escolha){
                        case 1:
                            System.out.println("Você ataca uma enorme esfera de fogo");
                            System.out.println("Derruba os dois jovens e entra no castelo");
                            System.out.println("Uma parede magica fecha o antigo buraco por onde entrou");
                            System.out.println("É impossivel fugir agora!");
                            System.out.println("Você sobre as escadas da torre e encontra um aprendiz");
                            System.out.println("ele não te vê então você rapidamente ataca");
                            System.out.println("Você está cansado e seu dano é reduzido");
                            dadom = (int) (Math.random() * 21);                                            //dano mago
                              if(dadom == 0){
                                 dadom++;
                             }
                              int lifeNPC = 7;
                              while(lifeNPC>0){
                                  lifeNPC = lifeNPC - dadom;
                                  System.out.println("Você causa " + dadom + " de dano");
                                  if(lifeNPC>0){
                                      System.out.println("O aprendiz se vira e te ataca");
                                      System.out.println("O ataque te causa 3 de dano");
                                      HP = HP - 3;
                                      
                                      dadom = (int) (Math.random() * 21);                                            //dano mago
                                     if(dadom == 0){
                                      dadom++;
                                      }
                                      
                                      System.out.println("Você ataca novamente e causa um dano de: " + dadom);
                                      lifeNPC = lifeNPC - dadom;
                                  }
                              }
                              System.out.println("O aprendiz cai sem vida ao chão");
                              System.out.println("");
                              System.out.println("==================================");
                              System.out.println("HP:" + HP);
                              System.out.println("==================================");
                              
                              System.out.println("você sobe as escadas para o ultimo andar");
                              System.out.println("ao pisar no último degrau escuta uma voz");
                              System.out.println("a voz ecoa pela sala e diz:");
                              System.out.println(name + "... Eu não ouço esse nome a muito tempo...");
                              System.out.println("... Filho...");
                              System.out.println("Você ataca");
                              dadom = (int) (Math.random() * 21);                                            //dano mago
                                     if(dadom == 0){
                                      dadom++;
                                      }
                              dadom = dadom + 5;
                              System.out.println("você causa " + dadom + " de dano");
                              
                              boss = boss - dadom;
                              
                              System.out.println("O mago em furia diz:");
                              System.out.println("Você é mesmo um rebelde meu filho");
                              System.out.println("Agora morra!");
                              
                              while(boss>0){
                                  System.out.println("O mago te ataca");
                                  diceBoss = (int) (Math.random() * 12);                                            //dano mago
                                     if(diceBoss == 0){
                                      diceBoss++;
                                      }
                                     HP = HP - diceBoss;
                                     
                                     System.out.println("");
                                     System.out.println("te causa: " +
                                     diceBoss
                                       +    " de dano");
                                     System.out.println("");
                                     
                                     if(HP <=0){
                                   System.out.println("Você morreu");
                                   System.out.println("");
                                   System.out.println("Obrigado por jogar");
                                   System.exit(0);
                                     }
                                     
                                     System.out.println("você ataca novamente");
                                     dadom = (int) (Math.random() * 21);                                            //dano mago
                                     if(dadom == 0){
                                      dadom++;
                                      }
                                    dadom = dadom + 5;
                                    
                                    boss = boss - dadom;
                                    
                                    System.out.println("Causando " + dadom + " de dano");
                                    System.out.println("");
                                    System.out.println("===============================");
                                    System.out.println("HP: " + HP);
                                    System.out.println("===============================");
                                    
                              }
                              System.out.println("Finalmente o seu inimigo e também pai" +
                                      " cai morto ao chão");
                              System.out.println("você retorna para sua aldeia feliz "
                                      + "por ter completado seu objetivo");
                              System.out.println("");
                              System.out.println("Obrigado por jogar");
                              System.exit(0);
                    
                        case 2:                                                                 //Fuga
                            System.out.println("Você foge!");
                            System.out.println("");
                            System.out.println("Obrigado por jogar");
                            System.exit(0);
                    }
                }
                else{
                    System.out.println("Quest disponivel apenas para magos");
                    System.exit(0);
                }
                
            case 2:
             System.out.println("Opção disponivel apenas no código da Larissa");                //A maioria dos jogos atualmente tem DLC
             System.out.println("");
             break;
             
            default:
                System.out.println("Valor invalido");
        }
      }
        while(true);
    }
}