package br.com.fiap.service;

import br.com.fiap.model.coins.CoinBitcoin;
import br.com.fiap.model.coins.CoinDog;
import br.com.fiap.model.coins.CoinSolana;
import br.com.fiap.model.coins.CoinUsdt;

public class CryptoService {

    private final CoinBitcoin bitcoin = new CoinBitcoin();
    private final CoinSolana solana = new CoinSolana();
    private final CoinUsdt usdt = new CoinUsdt();
    private final CoinDog doge = new CoinDog();

    public void showValues(int opcaoMoeda) {
        if (bitcoin.getCoinPriceBitcoinUsd() == -1) {
            System.out.println("Erro ao buscar os valores das moedas. Tente novamente mais tarde.");
            return;
        }
        switch (opcaoMoeda) {
            case 1:
                System.out.println(bitcoin.bitcoinDataUsd());
                System.out.println(solana.solanaDataUsd());
                System.out.println(usdt.usdtDataUsd());
                System.out.println(doge.dogDataUsd());
                break;
            case 2:
                System.out.println(bitcoin.bitcoinDataBrl());
                System.out.println(solana.solanaDataBrl());
                System.out.println(usdt.usdtDataBrl());
                System.out.println(doge.dogDataBrl());
                break;
            default:System.out.println("Opção inválida.");
            break;
        }
    }
}