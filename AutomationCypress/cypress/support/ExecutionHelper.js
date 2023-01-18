
export default class ExecutionHelper{

    static mouseHover(locator){
        locator.trigger('mouseover').invoke('show');
    }
   

}