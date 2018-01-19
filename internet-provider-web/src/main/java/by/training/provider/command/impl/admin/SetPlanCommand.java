package by.training.provider.command.impl.admin;

import by.training.provider.command.Command;
import by.training.provider.command.enums.UrlEnum;
import by.training.provider.dto.UrlResponse;
import by.training.provider.dto.ResponseMethod;

import javax.servlet.http.HttpServletRequest;

public class SetPlanCommand implements Command {

    /**
     * Returns set plan page url.
     *
     * @param request HttpServletRequest.
     * @return UrlResponse.
     */
    @Override
    public UrlResponse execute(HttpServletRequest request) {
        return new UrlResponse(ResponseMethod.FORWARD, UrlEnum.SET_PLAN);
    }
}
