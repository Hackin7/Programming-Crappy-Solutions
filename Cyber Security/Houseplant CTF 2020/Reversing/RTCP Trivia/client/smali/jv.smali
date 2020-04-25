.class public final Ljv;
.super Ljava/lang/Object;


# static fields
.field public static final A:Ljv;

.field public static final B:Ljv;

.field public static final C:Ljv;

.field public static final D:Ljv;

.field public static final E:Ljv;

.field public static final F:Ljv;

.field public static final G:Ljv;

.field public static final H:Ljv;

.field public static final I:Ljv;

.field public static final J:Ljv;

.field public static final K:Ljv;

.field public static final L:Ljv;

.field public static final M:Ljv;

.field public static final N:Ljv;

.field public static final O:Ljv;

.field public static final P:Ljv;

.field public static final Q:Ljv;

.field public static final R:Ljv;

.field public static final S:Ljv;

.field public static final T:Ljv;

.field public static final U:Ljv;

.field public static final V:Ljv;

.field public static final W:Ljv;

.field public static final X:Ljv;

.field public static final Y:Ljv;

.field public static final Z:Ljv;

.field static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final aA:Ljv;

.field public static final aB:Ljv;

.field public static final aC:Ljv;

.field public static final aD:Ljv;

.field public static final aE:Ljv;

.field public static final aF:Ljv;

.field public static final aG:Ljv;

.field public static final aH:Ljv;

.field public static final aI:Ljv;

.field public static final aJ:Ljv;

.field public static final aK:Ljv;

.field public static final aL:Ljv;

.field public static final aM:Ljv;

.field public static final aN:Ljv;

.field public static final aO:Ljv;

.field public static final aP:Ljv;

.field public static final aQ:Ljv;

.field public static final aR:Ljv;

.field public static final aS:Ljv;

.field public static final aT:Ljv;

.field public static final aU:Ljv;

.field public static final aV:Ljv;

.field public static final aW:Ljv;

.field public static final aX:Ljv;

.field public static final aY:Ljv;

.field public static final aZ:Ljv;

.field public static final aa:Ljv;

.field public static final ab:Ljv;

.field public static final ac:Ljv;

.field public static final ad:Ljv;

.field public static final ae:Ljv;

.field public static final af:Ljv;

.field public static final ag:Ljv;

.field public static final ah:Ljv;

.field public static final ai:Ljv;

.field public static final aj:Ljv;

.field public static final ak:Ljv;

.field public static final al:Ljv;

.field public static final am:Ljv;

.field public static final an:Ljv;

.field public static final ao:Ljv;

.field public static final ap:Ljv;

.field public static final aq:Ljv;

.field public static final ar:Ljv;

.field public static final as:Ljv;

.field public static final at:Ljv;

.field public static final au:Ljv;

.field public static final av:Ljv;

.field public static final aw:Ljv;

.field public static final ax:Ljv;

.field public static final ay:Ljv;

.field public static final az:Ljv;

.field public static final b:Ljv;

.field public static final ba:Ljv;

.field public static final bb:Ljv;

.field public static final bc:Ljv;

.field public static final bd:Ljv;

.field public static final be:Ljv;

.field public static final bf:Ljv;

.field public static final bg:Ljv;

.field public static final bh:Ljv;

.field public static final bi:Ljv;

.field private static final bk:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljv;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljv;

.field public static final d:Ljv;

.field public static final e:Ljv;

.field public static final f:Ljv;

.field public static final g:Ljv;

.field public static final h:Ljv;

.field public static final i:Ljv;

.field public static final j:Ljv;

.field public static final k:Ljv;

.field public static final l:Ljv;

.field public static final m:Ljv;

.field public static final n:Ljv;

.field public static final o:Ljv;

.field public static final p:Ljv;

.field public static final q:Ljv;

.field public static final r:Ljv;

.field public static final s:Ljv;

.field public static final t:Ljv;

.field public static final u:Ljv;

.field public static final v:Ljv;

.field public static final w:Ljv;

.field public static final x:Ljv;

.field public static final y:Ljv;

.field public static final z:Ljv;


# instance fields
.field final bj:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljv$1;

    invoke-direct {v0}, Ljv$1;-><init>()V

    sput-object v0, Ljv;->a:Ljava/util/Comparator;

    new-instance v0, Ljava/util/TreeMap;

    sget-object v1, Ljv;->a:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    sput-object v0, Ljv;->bk:Ljava/util/Map;

    const-string v0, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->b:Ljv;

    const-string v0, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->c:Ljv;

    const-string v0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->d:Ljv;

    const-string v0, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->e:Ljv;

    const-string v0, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->f:Ljv;

    const-string v0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->g:Ljv;

    const-string v0, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->h:Ljv;

    const-string v0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->i:Ljv;

    const-string v0, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->j:Ljv;

    const-string v0, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->k:Ljv;

    const-string v0, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->l:Ljv;

    const-string v0, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->m:Ljv;

    const-string v0, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->n:Ljv;

    const-string v0, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->o:Ljv;

    const-string v0, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->p:Ljv;

    const-string v0, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->q:Ljv;

    const-string v0, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->r:Ljv;

    const-string v0, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->s:Ljv;

    const-string v0, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->t:Ljv;

    const-string v0, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->u:Ljv;

    const-string v0, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->v:Ljv;

    const-string v0, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->w:Ljv;

    const-string v0, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->x:Ljv;

    const-string v0, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->y:Ljv;

    const-string v0, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->z:Ljv;

    const-string v0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->A:Ljv;

    const-string v0, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->B:Ljv;

    const-string v0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->C:Ljv;

    const-string v0, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->D:Ljv;

    const-string v0, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->E:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->F:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->G:Ljv;

    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->H:Ljv;

    const-string v0, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->I:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->J:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->K:Ljv;

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->L:Ljv;

    const-string v0, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->M:Ljv;

    const-string v0, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->N:Ljv;

    const-string v0, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->O:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->P:Ljv;

    const-string v0, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->Q:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->R:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->S:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->T:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->U:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->V:Ljv;

    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->W:Ljv;

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->X:Ljv;

    const-string v0, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->Y:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->Z:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aa:Ljv;

    const-string v0, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ab:Ljv;

    const-string v0, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ac:Ljv;

    const-string v0, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ad:Ljv;

    const-string v0, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ae:Ljv;

    const-string v0, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->af:Ljv;

    const-string v0, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ag:Ljv;

    const-string v0, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ah:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ai:Ljv;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aj:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ak:Ljv;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->al:Ljv;

    const-string v0, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->am:Ljv;

    const-string v0, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->an:Ljv;

    const-string v0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ao:Ljv;

    const-string v0, "TLS_FALLBACK_SCSV"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ap:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aq:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ar:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->as:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->at:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->au:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->av:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aw:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ax:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ay:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->az:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aA:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aB:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aC:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aD:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aE:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aF:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aG:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aH:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aI:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aJ:Ljv;

    const-string v0, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aK:Ljv;

    const-string v0, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aL:Ljv;

    const-string v0, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aM:Ljv;

    const-string v0, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aN:Ljv;

    const-string v0, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aO:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aP:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aQ:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aR:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aS:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aT:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aU:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aV:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aW:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aX:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aY:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->aZ:Ljv;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->ba:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bb:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bc:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bd:Ljv;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->be:Ljv;

    const-string v0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bf:Ljv;

    const-string v0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bg:Ljv;

    const-string v0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bh:Ljv;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v0

    sput-object v0, Ljv;->bi:Ljv;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    :cond_0
    iput-object p1, p0, Ljv;->bj:Ljava/lang/String;

    return-void
.end method

.method static varargs a([Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljv;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p0, v1

    invoke-static {v3}, Ljv;->a(Ljava/lang/String;)Ljv;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized a(Ljava/lang/String;)Ljv;
    .locals 3

    const-class v0, Ljv;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljv;->bk:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljv;

    if-nez v1, :cond_0

    new-instance v1, Ljv;

    invoke-direct {v1, p0}, Ljv;-><init>(Ljava/lang/String;)V

    sget-object v2, Ljv;->bk:Ljava/util/Map;

    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljv;->bj:Ljava/lang/String;

    return-object v0
.end method
