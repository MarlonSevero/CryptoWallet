package br.com.fiap.model.coins;

import br.com.fiap.factory.CryptoPriceFetcher;
import br.com.fiap.model.Crypto;

public class CoinDog extends Crypto {

    private final Crypto crypto = new Crypto();
    private final double coinPriceDogCoinUsd = CryptoPriceFetcher.getCryptoPrice(crypto.getDog(), crypto.getUsd());
    private final double coinPriceDogCoinBrl = CryptoPriceFetcher.getCryptoPrice(crypto.getDog(), crypto.getBrl());

    public double getCoinPriceDogCoinBrl() {return coinPriceDogCoinBrl;}

    public double getCoinPriceDogCoinUsd() {return coinPriceDogCoinUsd;}

    public String dogDataBrl(){
        return "PRECO do " + crypto.getDog() + " em " +
                "" + crypto.getBrl().toUpperCase() + ":" + getCoinPriceDogCoinBrl();
    }

    public String dogDataUsd(){
        return "PRECO do " + crypto.getDog() + " em " +
                "" + crypto.getUsd().toUpperCase() + ":" + getCoinPriceDogCoinUsd();
    }
}
