package com.projetojogorpgtextual.rpg.textual;

import java.util.Scanner;


public class RpgTextual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   //-----------------------------------------------
            //-- Variáveis

        int jogador, resposta, pontuacao = 0;
        int armadura = 0, arma = 0;
        int bonus;

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------- Início do Processo / Titulo ---------------------------------------------------------------------------------------

         System.out.printf(" ---------------------------------------%n"
                         + "|                                       |%n"
                         + "|     Titulo: O Prisioneiro de Aden     |%n"
                         + "|                                       |%n"
                         + " ---------------------------------------%n%n");

        System.out.printf("Objetivo: Resgatar seu companheiro(a)%n%n");
        System.out.printf("Regras do jogo:%n"
                        + "1- Para 'zerar' o jogo você precisará acertar todas as perguntas.%n"
                        + "2- O jogo continuará mesmo o jogador não acertando as perguntas da fase em questão.%n"
                        + "3- Não será possível trocar de personagem durante o jogo.%n"
                        + "4- Cada pergunta tem um nível, cada nível tem uma quantidade de pontos.%n"
                        + "5- Caso você digite alguma resposta/opção inválida, você perderá os pontos da fase%n"
                        + "6- Cada resposta correta além dos pontos você ganhará armamentos melhores.%n%n");

        System.out.printf("Escolha seu personagem:%n" 
                        + "     1) Montesquieu%n"
                        + "     2) Thatcher%n%n");
        jogador = sc.nextInt();

        
        if (jogador == 1){
            System.out.printf("%nO seu reino está sob ataque e sua parceira foi capturada e levada como prisioneira, salve-a.%n%n");
        }
        else{
            System.out.printf("%nO seu reino está sob ataque e seu parceiro foi capturado e levado como prisioneiro, salve-o.%n%n");
        }

//-------------------------------------------------------- Fim do Processo / Titulo ------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------- Início da Primeira parte ------------------------------------------------------------------------------------------

        System.out.printf("Você conseguiu reunir 10 homens para lhe acompanhar em sua jornada, então vamos partir para a missão.%n"
                        + "Você e seus homens estão andando fazem 3 dias e encontraram uma vila, porém, seus homens perceberam%n"
                        + "que o lugar é comandado pelo reino inimigo e você não pode ser detectado!%n%n"
                        + "Atenção, um morador viu você e seus homens e está indo falar com os guardas,%n"
                        + "para evitar que isso aconteça responda: %nValendo 350 pontos, quem foi Montesquieu?%n"
                        + "1- Iluminista, Ferreiro, Politico, Fisico.%n"
                        + "2- Juiz, Politico, Filósofo e Historiador.%n"
                        + "3- Historiador, fisico, iluminista e Politico.%n%n"
                          );
        resposta = sc.nextInt();

        if(resposta == 2){

            pontuacao = 350;
            armadura = 1;

            System.out.printf("Você acaba de ganhar 350 pontos e uma armadura nova para você e seu exército%n"
                            + "Você impediu o morador, agora ele irá ajudar você com o que precisar.%n%n");

        }

        else if(resposta == 1 || resposta == 3){

            System.out.printf("Resposta errada, você deixou passar 350 pontos.%n"
                            + "Como você não acertou a resposta, você não terá um armamento melhor, mas vamos lá, partiuuuu!%n%n");

        }

        else{

            System.out.printf("Resposta inválida, você deixou passar 350 pontos.%n"
                            + "Como você não acertou a resposta, você não terá um armamento melhor, mas vamos lá, partiuuuu!%n%n");

        }

//-------------------------------------------------------- Fim da Primeira parte ---------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------- Início da Segunda parte -------------------------------------------------------------------------------------------

        System.out.printf("Agora com as forças renovadas você e seus homens estão prontos para nova jornada!.%n"
                        + "O morador informou que o seu trajeto será mais difícil, devido as demais vilas estarem repletas de%n"
                        + "guardas da rainha Lovelace, isso irá dificultar seu trajeto.%n%n"
                         );
        
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

        else{

            System.out.printf("Você digitou uma opção inválida. Vamos fazer assim, como eu estou bêbado, vou deixar passar,%n"
                    + "então você não vai ganhar nem perder nada, mas olha lá em, só dessa vez!!%n"
                    + "OBSERVAÇÃO: Você deve estar se perguntando 'ué, mas não faz sentido, se eu errar a questão eu perco os pontos e%n"
                    + "sou penalizado, mais fácil eu simplesmente colocar algo que está errado'. Concordo, mas pensa bem,%n"
                    + "quando foi que um bêbado falou ou fez alguma coisa que fez sentido? Agora imagina estar bêbado e fazer um projeto de%n"
                    + "faculdade, kkkkkkkkk%n%n");

        }

//-------------------------------------------------------- Fim da Segunda parte ----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------- Início da Terceira parte ------------------------------------------------------------------------------------------

        System.out.printf("Você conseguiu evitar que sua localização fosse descoberta, porém, com isso você percebeu%n"
                        + "que seria difícil permanecer na vila sem ser detectado, existem muitos guardas%n"
                        + "tomando conta do lugar, então o jeito será continuar sua jornada,%n"
                        + "dessa vez sem descanso, então vamos marchar.%n%n");

        System.out.printf("Seus homens perceberam que vocês estão perdidos, mas para sua sorte%n"
                        + "aparentemente alguns civis estão vindo em direção oposta.%n%n"
                        + "Os civis falam uma língua diferente, mas um de seus guardas consegue entender%n"
                        + "o que eles falam, então ele pede infomação, mas você escuta algo estranho e quando%n"
                        + "olha para trás, vê um de seus homens sangrando, e outro lutando com um dos civis,%n"
                        + "então seu guarda grita 'CUIDADO SÃO LADRÕES', então uma luta começa.%n%n"
                        + "Embora seus guardas tenham armas e armaduras melhores, os ladrões são habilidosos e rápidos.%n"
                        + "Para evitar que você perca mais homens, responda corretamente:%n%n");

        System.out.printf("Valendo 230 pontos, em SQL Server para que uma PROCEDURE é utilizada?%n"
                        + "1) Uma procedure é um bloco de comandos ou instruções SQL.%n"
                        + "2) Uma procedure é um comando utilizado para fazer consultas.%n"
                        + "3) Uma procedure é utilizada para fazer update em tabelas/colunas.%n"
                        + "4) Uma procedure é utilizada para fazer insert's.%n"
                        + "5) Nenhuma das opções anteriores.%n"
                        + "6) Todas alternativas estão corretas.%n%n");

        resposta = sc.nextInt();

        if(resposta == 6){

            pontuacao += 230;
            arma += 1;
            armadura += 1;

            System.out.printf("Boa, já consegue entrar na área de banco de dados, hahaha, sua armadura e sua arma melhoraram e você ganhou 230 pontos.%n"
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

//-------------------------------------------------------- Fim da Terceira parte -------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------- Início da Quarta parte ------------------------------------------------------------------------------------------

        System.out.printf("Você conseguiu derrotar os ladrões e conseguiu a informação que precisava, para seguir seu caminho%n"
                        + "os ladrões informaram também que na próxima vila existem menos guardas fazendo ronda.%n%n");

        System.out.printf("O caminho que os ladrões passaram tem um obstáculo, você precisa atravessar um rio, o rio não é tão grande%n"
                        + "mas também não é tão pequeno para se atravessar nadando.%nPróximo de você tem algumas árvores que são%n"
                        + "perfeitas para construir um bote/barco.%n%n"

                        + "Agora que você conseguiu atravessar o rio, você consegue avistar a próxima vila,%n"
                        + "e como os ladrões haviam dito, não existem muitos guardas ali.%n%n");

        System.out.printf("Logo que você chega lá, você percebe que as pessoas não se sentem à vontade com os guardas%n"
                        + "um grupo de pessoas conversou com você e acabou lhe mostrando o quanto estão insatisfeitas%n"
                        + "com a presença dos seus inimigos, então entorno de 10 homens se juntaram a você%n%n");

        System.out.printf("O plano é o seguinte, você e seus homens irão cercar os guardas em uma taverna que eles%n"
                        + "frequentam todos os dias.%nPara que o plano de certo, responda corretamente:%n%n");

        System.out.printf("Valendo 170 pontos, para que serve o comando 'nextInt()' em java?%n"
                        + "1) Para ler um dado Boolean.%n"
                        + "2) Para ler um dado Float.%n"
                        + "3) Para ler um dado Númeric.%n"
                        + "4) Para ler um dado Inteiro.%n"
                        + "5) Todas as opções estão corretas.%n"
                        + "6) Todas as opções estão incorretas.%n%n");
        resposta = sc.nextInt();

        if(resposta == 4){

            pontuacao += 170;
            arma += 1;
            armadura += 1;

            System.out.println("Isso ai, o comando serve para receber numeros inteiros.");
            System.out.printf("Suas armaduras e suas armas foram melhoradas.%n%n"
                            + "Você encurralou os guardas na taverna e os derrotou.%n"
                            + "Seus homens vestiram os uniformes dos guardas inimigos, isso fará com que%n"
                            + "eles consigam entrar no reino sem serem detectados.%n%n");

        }

        else if(resposta < 0 || resposta > 6){

            System.out.printf("Pô bicho, resposta inválida?! AFF%n%n");
            System.out.printf("Você não conseguiu concluir o plano, vamos ");

        }

        else{

            System.out.println("Resposta incorreta.");

        }

//-------------------------------------------------------- Fim da Quarta parte ---------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------- Início da Quinta parte ------------------------------------------------------------------------------------------

    if(pontuacao == 1000 && arma == 3 && armadura == 3){

        System.out.printf("Com seus guardas dentro do castelo, você conseguiu entrar sem ser percebido%n"
                        + "está sendo sorrateiro e isso é bom, pois seus guardas não vão estar em todos os lugares.%n"
                        + "Depois de muito tempo você conseguiu chegar sorrateiramente até a torre e conseguiu entrar%n"
                        + "você agora está sozinho, seus guardas não conseguiram te ajudar caso algo dê errado.%n%n");

        bonus = 1;

        if(bonus != 0 && jogador == 1){

            System.out.printf("Você está no primeiro andar, e a sua companheira está no segundo andar%n"
                            + "Existe um sentinela guardando a sela da sua companheira.%n"
                            + "Você precisa sumir com o sentinela sem que ele alerte os outros guardas,%n"
                            + "para conseguir isso você precisa acertar a pergunta abaixo, caso contrário%n"
                            + "não terá adiantado de nada ter chegado até aqui, então vamos lá.%n%n");

            System.out.printf("Para que serve o comando 'Console.Writeline' em C# (CSharp)%n"  //ver
                            + "1) O comando serve para converter um dado.%n"
                            + "2) O comando serve para concatenar um dado.%n"
                            + "3) O comando serve para imprimir um dado%n"
                            + "4) Todas as alternativas estão erradas.%n%n");
            resposta = sc.nextInt();

        }

        else {

            System.out.printf("Você está no primeiro andar, e seu companheiro está no segundo andar%n"
                            + "Existe um sentinela guardando a sela do seu companheiro.%n"
                            + "Você precisa sumir com o sentinela sem que ele alerte os outros guardas,%n"
                            + "para conseguir isso você precisa acertar a pergunta abaixo, caso contrário%n"
                            + "não terá adiantado de nada ter chegado até aqui, então vamos lá.%n%n");

            System.out.printf("Para que serve o comando 'Console.Writeline' em C# (CSharp)%n"  //ver
                            + "1) O comando serve para converter um dado.%n"
                            + "2) O comando serve para concatenar um dado.%n"
                            + "3) O comando serve para imprimir um dado%n"
                            + "4) Todas as alternativas estão erradas.%n%n");
            resposta = sc.nextInt();

        }

        if(resposta == 3){
            System.out.printf("Boa, você conseguiu, concluiu seu objetivo.%n"
                            + "Não achou que teria uma histórinha falando 'E eles viveram felizes%n"
                            + "para sempre', achou?! Pois não tem... Você conseguiu e é isso ai,%n"
                            + "come um pastel com caldo de cana e seja feliz ooou me chama para tomar um litrão! kkk.");
        }

    }
    
    else{
            System.out.printf("Você não conseguiu concluir o plano."
                + "O reino inimigo está logo á frente e você não possui os requisitos necessários, para continuar.%n"
                + "É meu anjo, kkk, a demo chegou ao final, 'Compre' o jogo começando do ZERO e acerte todas as perguntas, kkk.");

    }

//-------------------------------------------------------- Fim da Quinta parte ---------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    sc.close();

    }
}