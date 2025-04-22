package br.com.fiap.model.coins;

import br.com.fiap.model.Crypto;
import br.com.fiap.factory.CryptoPriceFetcher;

public class CoinSolana {

    private final Crypto crypto = new Crypto();
    private final double coinPriceSolanaUsd = CryptoPriceFetcher.getCryptoPrice(crypto.getSolana(), crypto.getUsd());
    private final double coinPriceSolanaBrl = CryptoPriceFetcher.getCryptoPrice(crypto.getSolana(), crypto.getBrl());

    public double getCoinPriceSolanaBrl() {
        return coinPriceSolanaBrl;
    }
    public double getCoinPriceSolanaUsd() {return coinPriceSolanaUsd;}

    public String solanaDataBrl(){
        return "PRECO do " + crypto.getSolana() + " em " +
               "" + crypto.getBrl().toUpperCase() + ":" + getCoinPriceSolanaBrl();
    }

    public String solanaDataUsd(){
        return "PRECO do " + crypto.getSolana() + " em " +
                "" + crypto.getUsd().toUpperCase() + ":" + getCoinPriceSolanaUsd();
    }

}
