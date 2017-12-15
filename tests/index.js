exports.defineAutoTests = function() {
    it('should exist', function() {
        expect(window.plugins.isDebuggable).toBeDefined();
    });

    it('should be a function', function() {
        expect(typeof window.plugins.isDebuggable).toEqual('function');
    });

    it('should work', function(done) {
        var onSuccess = function(result) {
            expect(typeof result).toEqual('boolean');
            done();
        };
        window.plugins.isDebuggable(onSuccess, done);
    });
};
