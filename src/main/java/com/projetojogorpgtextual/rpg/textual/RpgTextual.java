package com.projetojogorpgtextual.rpg.textual;

import java.util.Locale;
import java.util.Scanner;


public class RpgTextual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


   //-----------------------------------------------
            //-- Variáveis

        int jogador = 0, resposta = 0, pontuacao = 0;
        int armadura = 0, arma = 0;

   //-----------------------------------------------


        System.out.printf(" ---------------------------------------%n"
                         + "|                                       |%n"
                         + "|     Titulo: O Prisioneiro de Aden     |%n"
                         + "|                                       |%n"
                         + " ---------------------------------------%n%n");

        System.out.printf("Objetivo: Resgatar seu companheiro(a)%n%n");
        System.out.printf("Regras do jogo:%n"
                        + "1- Para 'zerar' o jogo você precisará acertar todas as perguntas durante o jogo.%n"
                        + "2- O jogo continuará mesmo o jogador não acertando as perguntas da fase em questão.%n"
                        + "3- Não será possível trocar de personágem durante o jogo.%n"
                        + "4- Cada Pergunta tem um nível, cada nível tem uma quantidade de pontos.%n"
                        + "5- Caso você digite alguma resposta/opção inválida, você perderá os pontos da fase%n"
                        + "6- Cada resposta correta além dos pontos você ganhará armamentos melhores.%n%n"
                         );

        System.out.printf("Escolha seu personagem:%n"
                        + "     1) Montesquieu%n"
                        + "     2) Thatcher%n%n");
        jogador = sc.nextInt();

        switch(jogador){
            case 1:
                System.out.printf("%nO seu reino está sob ataque e sua parceira foi capturada e levada como prisioneira, salve-a.%n%n");
                System.exit(jogador);
            break;

            case 2:
                System.out.printf("%nO seu reino está sob ataque e seu parceiro foi capturado e levado como prisioneiro, salve-o.%n%n");
                System.exit(jogador);
            break;

            default:
                System.out.println("Digite uma das opções apresentadas abaixo%n%n");
                System.out.printf("Escolha seu personagem:%n"
                                + " 1) Montesquieu%n"
                                + " 2) Thatcher%n%n");
                jogador = sc.nextInt();

        }

        System.out.printf("Você conseguiu reunir 10 homens para lhe acompanhar em sua jornada, então vamos partir para missão.%n"
                        + "Você e seus homens estão andando fazem 3 dias e encontraram uma vila, porém, seus homens perceberam%n"
                        + "que o lugar é comandado pelo reino inimigo e você não pode ser detectado!%n%n"
                        + "Atenção, um morador viu você e seus homens e está indo falar com os guardas,%n"
                        + "para evitar que isso aconteça responda: %nValendo 150 pontos, quem foi Montesquieu?%n"
                        + "1- Iluminista, Ferreiro, Politico, Fisico.%n"
                        + "2- Juiz, Politico, Filósofo e Historiador.%n"
                        + "3- Historiador, fisico, iluminista e Politico.%n%n"
                          );
        resposta = sc.nextInt();

        if(resposta == 2){

            pontuacao = 150;
            armadura = 1;
            System.out.printf("Você acaba de ganhar 150 pontos e uma armadura nova para você e seu exército%n"
                            + "Você impediu o morador, agora ele irá ajudar você com o que precisar.%n%n"
                             );

        }

        else if(resposta == 1 || resposta == 3){

            System.out.printf("Resposta errada, você deixou passar 150 pontos.%n"
                            + "Como você não acertou a resposta, você não terá um armamento melhor, mas vamos lá, partiuuuu!%n%n");

        }

        else{

            System.out.printf("Resposta errada, você deixou passar 150 pontos.%n"
                            + "Como você não acertou a resposta, você não terá um armamento melhor, mas vamos lá, partiuuuu!%n%n");

        }

        System.out.printf("Agora com as forças renovadas você e seus homens estão prontos para nova jornada!.%n"
                        + "O morador informou que o seu trajeto será mais difícil, devido as demais vilas estarem repletas de%n"
                        + "guardas da rainha Lovelace, isso irá dificultar seu trajeto.%n%n"
                         );

        
                                //-- Parei aqui, preciso ver a história direito, mas vai dar certo time!
        
        System.out.printf("Depois de dias andando você finalmente consegue ver uma vila, porém,%n"
                        + "você perceber que a bandeira do reino inimigo está por toda parte.%n"
                        + "Um guarda inimigo conseguiu ver um de seus homens, mate-o antes que ele informe a sua posição,%n"
                        + "para concluir seu objetivo, responda:%n%n"

                        + "Valendo 250 pontos e uma espada, quem foi 'Margaret Thatcher'?%n"
                        + "1) Primeira ministra dos Estados Unidos.%n"
                        + "2) Primeira ministra da Polonia.%n"
                        + "3) Primeira ministra do Reino Unido.%n%n"
                         );

        resposta = sc.nextInt();

        if(resposta == 3){

            pontuacao += 250;
            arma = 1;
            System.out.printf("Você e seus homens acabam de ganhar 250 pontos e uma espada TOP%n%n");

        }

        else if(resposta == 1 || resposta == 2){

            pontuacao -= 50;
            System.out.printf("Você não sabe quem é Margaret Thatcher? por conta disso não ganhou os 250 pontos%n"
                            + "e ainda vai perder mais 50 pontos como penalidade.%n%n");

        }
                    //-- Verificar essa parte depois!
        else{

            System.out.printf("Você digitou uma opção inválida. Vamos fazer assim, como eu estou bebado, vou deixar passar,%n"
                    + "então você não vai ganhar nem perder nada, mas olha lá em, só dessa vez!!%n"
                    + "OBSERVAÇÃO: Você deve estar se perguntando 'ué, mas não faz sentido, se eu errar a questão eu perco os pontos e%n"
                    + "sou penalizado, mais facil eu simplesmente colocar algo que está errado'. Concordo, mas pensa bem,%n"
                    + "quando foi que um bebado falou ou fez alguma coisa que fez sentido? Agora imagina estar bebado e fazer um projeto de%n"
                    + "faculdade, kkkkkkkkk%n%n");

        }

        System.out.printf("Você conseguiu evitar que sua localização fosse descoberta, porém, com isso você percebeu%n"
                        + "que seria difícil permanecer na vila sem ser detectado, existem muitos guardas%n"
                        + "tomando de conta do logar, então o jeito será continuar sua jornada,%n"
                        + "dessa vfez sem descanso, então vamos marchar..%n%n");

        System.out.printf("Seus homens perceberam que vocês estão perdidos, mas para sua sorte%n"
                        + "aparentemente alguns civis estão vindo direção oposta.%n%n"
                        + "Os civis falam uma lingua diferente, mas um de seus guardas consegue entender%n"
                        + "o que eles falam, então ele pede infomação, mas você escuta algo estranho e quando%n"
                        + "olha para trás, vê um de seus homens sangrando, e outro lutando com um dos civis,%n"
                        + "então seu guarda grita 'CUIDADO SÃO LADRÕES', então uma luta começa.%n%n"
                        + "Embora seus guardas tenham armas e armaduras melhores, os ladrões são habilidosos e rapidos.%n"
                        + "Para evitar que você perca mais homens, responda corretamente:%n%n");

        System.out.printf("Em SQL Serverm para que uma PROCEDURE é utilizada?%n"
                        + "1) Uma procedure é um bloco de comandos ou instruções SQL organizados para executar uma ou mais tarefas.%n"
                        + "2) Uma procedure é um comando utilizado para fazer consultas.%n"
                        + "3) Uma procedure é utilizada para fazer update em tabelas/colunas.%n"
                        + "4) Uma procedure é utilizada para fazer insert's.%n"
                        + "5) Nenhuma das opçãoes anteriores.%n"
                        + "6) Todas alternativas estão corretas.%n%n");

        resposta = sc.nextInt();

        if(resposta == 6){

            pontuacao += 197;
            arma += 1;
            System.out.printf("Boa, já consegue entrar na area de banco de dados, hahaha, sua arma melhorou, sua arma e ganhou 197 pontos.%n"
                            + "Sua pontuação geral é de: " + pontuacao + "%n%n");

        }

        else if(resposta >= 1 && resposta <= 5){

            System.out.printf("Resposta incorreta.%n"
                            + "É bicho, o negócio está tenso pro seu lado.%n"
                            + "Sua pontuação é de: " + pontuacao + "%n%n");

        }

        else{

            System.out.printf("Resposta inválida.%n"
                            + "Sua pontuação é de: " + pontuacao + "%n%n");

        }

        System.out.printf("Você conseguiu derrotar os ladrões e conseguiu a informação que precisava, para seguir seu caminho%n"
                        + "os ladrões informaram também que na proxima vila existem menos guardas fazendo ronda.%n%n");

        System.out.printf("O caminho que os ladrões passaram tem um obstaculo, você precisa atravessar um rio, o rio não é tão grande%n"
                        + "mas também não é tão pequeno para se atravessar nadando.%nProximo de você tem algumas arvores que são%n"
                        + "perfeitas para construir um bote/barco.%n%n"

                        + "Agora que você conseguiu atravessar o rio, você consegue avistar a proxima vila,%n"
                        + "e como os ladrões haviam dito, não existem muitos guardas ali.%n%n");

        System.out.printf("Logo que você chega lá, você percebe que as pessoas não se sentem à vontade com os guardas%n"
                        + "um grupo de pessoas conversou com você e acabou lhe mostrando o quanto estão insatisfeitas%n"
                        + "com a presença dos seus inimigos, então entorno de 10 homens se juntaram a você%n%n");

        System.out.printf("O plano é o seguinte, você e seus homens irão cercar os guardas em uma taverna que eles%n"
                        + "frequentam todos os dias.%nPara que o plano de certo, responda corretamente:%n%n");

        System.out.printf("para que serve o comando 'nextInt()' em java?%n"
                        + "1) Para ler um dado Boolean.%n"
                        + "2) Para ler um dado Float.%n"
                        + "3) Para ler um dado Númeric.%n"
                        + "4) Para ler um dado Inteiro.%n"
                        + "5) Todas as opções estão corretas.%n"
                        + "6) Todas as opções estão incorretas.%n%n");
        resposta = sc.nextInt();

        if(resposta == 4){

            arma += 1;
            armadura += 1;
            System.out.println("Isso ai, o comando serve para receber numeros inteiros.");
            System.out.printf("Você conseguiu exterminar todos os guardas e conquistou a vila.%n"
                            + "o reino inimigo está logo após as montanhas, junte seus homens e vamos marchar.%n"
                            + "Você melhorou sua armadura e sua arma.");

        }

        else if(resposta < 0 || resposta > 6){

            System.out.printf("Pô bicho, resposta inválida?! AFF%n%n");

        }

        else{

            System.out.println("Resposta incorreta.");
            System.out.printf("Você não conseguiu concluir o plano");

        }



    }
}
