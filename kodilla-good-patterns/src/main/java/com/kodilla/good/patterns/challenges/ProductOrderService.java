package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ProductRepository productRepository;
    private UserRepository userRepository;
    private InformService informService;
    private BuyService buyService;


    public ProductOrderService(final ProductRepository productRepository, final UserRepository userRepository, final InformService informService, final BuyService buyService) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.informService = informService;
        this.buyService = buyService;
    }

    public void processes(final BuyRequest buyRequest) {
        boolean isSold = buyService.sell(productRepository.getSellPrice(), buyRequest.getOfferedPrice());

        if (isSold){
            informService.informSeller(userRepository.getSeller(), userRepository.getBuyer().getAddress());
            informService.informBuyer(userRepository.getBuyer(), true);
            productRepository.sold();
        } else {
            informService.informBuyer(userRepository.getBuyer(), false);
        }
    }
}
