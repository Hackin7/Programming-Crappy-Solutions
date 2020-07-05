package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: nl */
public final class C0768nl {

    /* renamed from: a */
    static final Logger f3282a = Logger.getLogger(C0768nl.class.getName());

    private C0768nl() {
    }

    /* renamed from: a */
    public static C0760nd m2507a(C0777nr nrVar) {
        return new C0772nm(nrVar);
    }

    /* renamed from: a */
    public static C0761ne m2508a(C0778ns nsVar) {
        return new C0773nn(nsVar);
    }

    /* renamed from: a */
    public static C0777nr m2509a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        } else {
            final C0753na c = m2514c(socket);
            final OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new C0777nr(new C0777nr() {
                    /* renamed from: a */
                    public final C0779nt mo2465a() {
                        return C0779nt.this;
                    }

                    /* renamed from: a_ */
                    public final void mo2450a_(C0758nc ncVar, long j) {
                        C0781nu.m2596a(ncVar.f3257b, 0, j);
                        while (j > 0) {
                            C0779nt.this.mo2693f();
                            C0774no noVar = ncVar.f3256a;
                            int min = (int) Math.min(j, (long) (noVar.f3296c - noVar.f3295b));
                            outputStream.write(noVar.f3294a, noVar.f3295b, min);
                            noVar.f3295b += min;
                            long j2 = (long) min;
                            j -= j2;
                            ncVar.f3257b -= j2;
                            if (noVar.f3295b == noVar.f3296c) {
                                ncVar.f3256a = noVar.mo2707c();
                                C0775np.m2563a(noVar);
                            }
                        }
                    }

                    public final void close() {
                        outputStream.close();
                    }

                    public final void flush() {
                        outputStream.flush();
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("sink(");
                        sb.append(outputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                }) {

                    /* renamed from: a */
                    final /* synthetic */ C0777nr f3249a;

                    {
                        this.f3249a = r2;
                    }

                    /* renamed from: a */
                    public final C0779nt mo2465a() {
                        return C0753na.this;
                    }

                    /* renamed from: a_ */
                    public final void mo2450a_(C0758nc ncVar, long j) {
                        C0781nu.m2596a(ncVar.f3257b, 0, j);
                        while (true) {
                            long j2 = 0;
                            if (j > 0) {
                                C0774no noVar = ncVar.f3256a;
                                while (true) {
                                    if (j2 >= 65536) {
                                        break;
                                    }
                                    j2 += (long) (noVar.f3296c - noVar.f3295b);
                                    if (j2 >= j) {
                                        j2 = j;
                                        break;
                                    }
                                    noVar = noVar.f3299f;
                                }
                                C0753na.this.mo2601b_();
                                try {
                                    this.f3249a.mo2450a_(ncVar, j2);
                                    j -= j2;
                                    C0753na.this.mo2599a(true);
                                } catch (IOException e) {
                                    throw C0753na.this.mo2600b(e);
                                } catch (Throwable th) {
                                    C0753na.this.mo2599a(false);
                                    throw th;
                                }
                            } else {
                                return;
                            }
                        }
                    }

                    public final void close() {
                        C0753na.this.mo2601b_();
                        try {
                            this.f3249a.close();
                            C0753na.this.mo2599a(true);
                        } catch (IOException e) {
                            throw C0753na.this.mo2600b(e);
                        } catch (Throwable th) {
                            C0753na.this.mo2599a(false);
                            throw th;
                        }
                    }

                    public final void flush() {
                        C0753na.this.mo2601b_();
                        try {
                            this.f3249a.flush();
                            C0753na.this.mo2599a(true);
                        } catch (IOException e) {
                            throw C0753na.this.mo2600b(e);
                        } catch (Throwable th) {
                            C0753na.this.mo2599a(false);
                            throw th;
                        }
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                        sb.append(this.f3249a);
                        sb.append(")");
                        return sb.toString();
                    }
                };
            }
            throw new IllegalArgumentException("out == null");
        }
    }

    /* renamed from: a */
    public static C0778ns m2510a(InputStream inputStream) {
        return m2511a(inputStream, new C0779nt());
    }

    /* renamed from: a */
    private static C0778ns m2511a(final InputStream inputStream, final C0779nt ntVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (ntVar != null) {
            return new C0778ns() {
                /* renamed from: a */
                public final long mo2414a(C0758nc ncVar, long j) {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("byteCount < 0: ");
                        sb.append(j);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            C0779nt.this.mo2693f();
                            C0774no e = ncVar.mo2636e(1);
                            int read = inputStream.read(e.f3294a, e.f3296c, (int) Math.min(j, (long) (8192 - e.f3296c)));
                            if (read == -1) {
                                return -1;
                            }
                            e.f3296c += read;
                            long j2 = (long) read;
                            ncVar.f3257b += j2;
                            return j2;
                        } catch (AssertionError e2) {
                            if (C0768nl.m2512a(e2)) {
                                throw new IOException(e2);
                            }
                            throw e2;
                        }
                    }
                }

                /* renamed from: a */
                public final C0779nt mo2415a() {
                    return C0779nt.this;
                }

                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(inputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    static boolean m2512a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: b */
    public static C0778ns m2513b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        } else {
            C0753na c = m2514c(socket);
            return new C0778ns(m2511a(socket.getInputStream(), c)) {

                /* renamed from: a */
                final /* synthetic */ C0778ns f3251a;

                {
                    this.f3251a = r2;
                }

                /* renamed from: a */
                public final long mo2414a(C0758nc ncVar, long j) {
                    C0753na.this.mo2601b_();
                    try {
                        long a = this.f3251a.mo2414a(ncVar, j);
                        C0753na.this.mo2599a(true);
                        return a;
                    } catch (IOException e) {
                        throw C0753na.this.mo2600b(e);
                    } catch (Throwable th) {
                        C0753na.this.mo2599a(false);
                        throw th;
                    }
                }

                /* renamed from: a */
                public final C0779nt mo2415a() {
                    return C0753na.this;
                }

                public final void close() {
                    try {
                        this.f3251a.close();
                        C0753na.this.mo2599a(true);
                    } catch (IOException e) {
                        throw C0753na.this.mo2600b(e);
                    } catch (Throwable th) {
                        C0753na.this.mo2599a(false);
                        throw th;
                    }
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
                    sb.append(this.f3251a);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
    }

    /* renamed from: c */
    private static C0753na m2514c(final Socket socket) {
        return new C0753na() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final IOException mo2515a(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo2516a() {
                Logger logger;
                Level level;
                StringBuilder sb;
                try {
                    socket.close();
                } catch (Exception e) {
                    logger = C0768nl.f3282a;
                    level = Level.WARNING;
                    sb = new StringBuilder("Failed to close timed out socket ");
                    r0 = e;
                    sb.append(socket);
                    logger.log(level, sb.toString(), r0);
                } catch (AssertionError e2) {
                    if (C0768nl.m2512a(e2)) {
                        logger = C0768nl.f3282a;
                        level = Level.WARNING;
                        sb = new StringBuilder("Failed to close timed out socket ");
                        r0 = e2;
                        sb.append(socket);
                        logger.log(level, sb.toString(), r0);
                    }
                    throw e2;
                }
            }
        };
    }
}
