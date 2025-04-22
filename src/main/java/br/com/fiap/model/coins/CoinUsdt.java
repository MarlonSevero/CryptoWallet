package br.com.fiap.model.coins;

import br.com.fiap.model.Crypto;
import br.com.fiap.factory.CryptoPriceFetcher;

public class CoinUsdt {
    private final Crypto crypto = new Crypto();
    private final double coinPriceUsdtUsd = CryptoPriceFetcher.getCryptoPrice(crypto.getUsdt(), crypto.getUsd());
    private final double coinPriceUsdtBrl = CryptoPriceFetcher.getCryptoPrice(crypto.getUsdt(), crypto.getBrl());

    public double getCoinPriceUsdtUsd() {
        return coinPriceUsdtUsd;
    }

    public double getCoinPriceUsdtBrl() {
        return coinPriceUsdtBrl;
    }

    public String usdtDataBrl(){
        return "PRECO do " + crypto.getUsdt() + " em " +
                "" + crypto.getBrl().toUpperCase() + ":" + getCoinPriceUsdtBrl();
    }

    public String usdtDataUsd(){
        return "PRECO do " + crypto.getUsdt() + " em " +
                "" + crypto.getUsd().toUpperCase() + ":" + getCoinPriceUsdtUsd();
    }
}
