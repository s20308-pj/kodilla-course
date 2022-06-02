package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ProductInterface productInterface;
    private UserRepository userRepository;
    private InformService informService;
    private BuyService buyService;


    public ProductOrderService(final ProductInterface productRepository, final UserRepository userRepository, final InformService informService, final BuyService buyService) {
        this.productInterface = productRepository;
        this.userRepository = userRepository;
        this.informService = informService;
        this.buyService = buyService;
    }

    public void processes(final BuyRequest buyRequest) {
        boolean isSold = buyService.sell(productInterface.getSellPrice(), buyRequest.getOfferedPrice());

        if (isSold){
            informService.informSeller(userRepository.getSeller(), userRepository.getBuyer().getAddress());
            informService.informBuyer(userRepository.getBuyer(), true);
            productInterface.sold();
        } else {
            informService.informBuyer(userRepository.getBuyer(), false);
        }
    }
}
