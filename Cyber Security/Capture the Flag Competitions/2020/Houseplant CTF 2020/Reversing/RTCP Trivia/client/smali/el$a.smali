.class public final Lel$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:F

.field public R:F

.field public S:I

.field public T:I

.field public U:F

.field public V:Z

.field public W:F

.field public X:F

.field public Y:F

.field public Z:F

.field public a:Z

.field public aa:F

.field public ab:F

.field public ac:F

.field public ad:F

.field public ae:F

.field public af:F

.field public ag:F

.field public ah:Z

.field public ai:Z

.field public aj:I

.field public ak:I

.field public al:I

.field public am:I

.field public an:I

.field public ao:I

.field public ap:F

.field public aq:F

.field public ar:I

.field public as:I

.field public at:[I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:F

.field public v:F

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method private constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lel$a;->a:Z

    const/4 v1, -0x1

    iput v1, p0, Lel$a;->e:I

    iput v1, p0, Lel$a;->f:I

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, p0, Lel$a;->g:F

    iput v1, p0, Lel$a;->h:I

    iput v1, p0, Lel$a;->i:I

    iput v1, p0, Lel$a;->j:I

    iput v1, p0, Lel$a;->k:I

    iput v1, p0, Lel$a;->l:I

    iput v1, p0, Lel$a;->m:I

    iput v1, p0, Lel$a;->n:I

    iput v1, p0, Lel$a;->o:I

    iput v1, p0, Lel$a;->p:I

    iput v1, p0, Lel$a;->q:I

    iput v1, p0, Lel$a;->r:I

    iput v1, p0, Lel$a;->s:I

    iput v1, p0, Lel$a;->t:I

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lel$a;->u:F

    iput v2, p0, Lel$a;->v:F

    const/4 v2, 0x0

    iput-object v2, p0, Lel$a;->w:Ljava/lang/String;

    iput v1, p0, Lel$a;->x:I

    iput v0, p0, Lel$a;->y:I

    const/4 v2, 0x0

    iput v2, p0, Lel$a;->z:F

    iput v1, p0, Lel$a;->A:I

    iput v1, p0, Lel$a;->B:I

    iput v1, p0, Lel$a;->C:I

    iput v1, p0, Lel$a;->D:I

    iput v1, p0, Lel$a;->E:I

    iput v1, p0, Lel$a;->F:I

    iput v1, p0, Lel$a;->G:I

    iput v1, p0, Lel$a;->H:I

    iput v1, p0, Lel$a;->I:I

    iput v0, p0, Lel$a;->J:I

    iput v1, p0, Lel$a;->K:I

    iput v1, p0, Lel$a;->L:I

    iput v1, p0, Lel$a;->M:I

    iput v1, p0, Lel$a;->N:I

    iput v1, p0, Lel$a;->O:I

    iput v1, p0, Lel$a;->P:I

    iput v2, p0, Lel$a;->Q:F

    iput v2, p0, Lel$a;->R:F

    iput v0, p0, Lel$a;->S:I

    iput v0, p0, Lel$a;->T:I

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lel$a;->U:F

    iput-boolean v0, p0, Lel$a;->V:Z

    iput v2, p0, Lel$a;->W:F

    iput v2, p0, Lel$a;->X:F

    iput v2, p0, Lel$a;->Y:F

    iput v2, p0, Lel$a;->Z:F

    iput v3, p0, Lel$a;->aa:F

    iput v3, p0, Lel$a;->ab:F

    const/high16 v4, 0x7fc00000    # Float.NaN

    iput v4, p0, Lel$a;->ac:F

    iput v4, p0, Lel$a;->ad:F

    iput v2, p0, Lel$a;->ae:F

    iput v2, p0, Lel$a;->af:F

    iput v2, p0, Lel$a;->ag:F

    iput-boolean v0, p0, Lel$a;->ah:Z

    iput-boolean v0, p0, Lel$a;->ai:Z

    iput v0, p0, Lel$a;->aj:I

    iput v0, p0, Lel$a;->ak:I

    iput v1, p0, Lel$a;->al:I

    iput v1, p0, Lel$a;->am:I

    iput v1, p0, Lel$a;->an:I

    iput v1, p0, Lel$a;->ao:I

    iput v3, p0, Lel$a;->ap:F

    iput v3, p0, Lel$a;->aq:F

    iput v1, p0, Lel$a;->ar:I

    iput v1, p0, Lel$a;->as:I

    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lel$a;-><init>()V

    return-void
.end method


# virtual methods
.method final a(ILem$a;)V
    .locals 1

    iput p1, p0, Lel$a;->d:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iput p1, p0, Lel$a;->h:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iput p1, p0, Lel$a;->i:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iput p1, p0, Lel$a;->j:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iput p1, p0, Lel$a;->k:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iput p1, p0, Lel$a;->l:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iput p1, p0, Lel$a;->m:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iput p1, p0, Lel$a;->n:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iput p1, p0, Lel$a;->o:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iput p1, p0, Lel$a;->p:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iput p1, p0, Lel$a;->q:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iput p1, p0, Lel$a;->r:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iput p1, p0, Lel$a;->s:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iput p1, p0, Lel$a;->t:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iput p1, p0, Lel$a;->u:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iput p1, p0, Lel$a;->v:F

    iget-object p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iput-object p1, p0, Lel$a;->w:Ljava/lang/String;

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iput p1, p0, Lel$a;->x:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iput p1, p0, Lel$a;->y:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iput p1, p0, Lel$a;->z:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iput p1, p0, Lel$a;->A:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iput p1, p0, Lel$a;->B:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:I

    iput p1, p0, Lel$a;->C:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iput p1, p0, Lel$a;->g:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iput p1, p0, Lel$a;->e:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iput p1, p0, Lel$a;->f:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    iput p1, p0, Lel$a;->b:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    iput p1, p0, Lel$a;->c:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->leftMargin:I

    iput p1, p0, Lel$a;->D:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->rightMargin:I

    iput p1, p0, Lel$a;->E:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->topMargin:I

    iput p1, p0, Lel$a;->F:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->bottomMargin:I

    iput p1, p0, Lel$a;->G:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:F

    iput p1, p0, Lel$a;->Q:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iput p1, p0, Lel$a;->R:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iput p1, p0, Lel$a;->T:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iput p1, p0, Lel$a;->S:I

    iget-boolean p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iput-boolean p1, p0, Lel$a;->ah:Z

    iget-boolean p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    iput-boolean p1, p0, Lel$a;->ai:Z

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iput p1, p0, Lel$a;->aj:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iput p1, p0, Lel$a;->ak:I

    iget-boolean p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iput-boolean p1, p0, Lel$a;->ah:Z

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iput p1, p0, Lel$a;->al:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:I

    iput p1, p0, Lel$a;->am:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iput p1, p0, Lel$a;->an:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iput p1, p0, Lel$a;->ao:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iput p1, p0, Lel$a;->ap:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:F

    iput p1, p0, Lel$a;->aq:F

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x11

    if-lt p1, v0, :cond_0

    invoke-virtual {p2}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->getMarginEnd()I

    move-result p1

    iput p1, p0, Lel$a;->H:I

    invoke-virtual {p2}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->getMarginStart()I

    move-result p1

    iput p1, p0, Lel$a;->I:I

    :cond_0
    iget p1, p2, Lem$a;->an:F

    iput p1, p0, Lel$a;->U:F

    iget p1, p2, Lem$a;->aq:F

    iput p1, p0, Lel$a;->X:F

    iget p1, p2, Lem$a;->ar:F

    iput p1, p0, Lel$a;->Y:F

    iget p1, p2, Lem$a;->as:F

    iput p1, p0, Lel$a;->Z:F

    iget p1, p2, Lem$a;->at:F

    iput p1, p0, Lel$a;->aa:F

    iget p1, p2, Lem$a;->au:F

    iput p1, p0, Lel$a;->ab:F

    iget p1, p2, Lem$a;->av:F

    iput p1, p0, Lel$a;->ac:F

    iget p1, p2, Lem$a;->aw:F

    iput p1, p0, Lel$a;->ad:F

    iget p1, p2, Lem$a;->ax:F

    iput p1, p0, Lel$a;->ae:F

    iget p1, p2, Lem$a;->ay:F

    iput p1, p0, Lel$a;->af:F

    iget p1, p2, Lem$a;->az:F

    iput p1, p0, Lel$a;->ag:F

    iget p1, p2, Lem$a;->ap:F

    iput p1, p0, Lel$a;->W:F

    iget-boolean p1, p2, Lem$a;->ao:Z

    iput-boolean p1, p0, Lel$a;->V:Z

    return-void
.end method

.method public final a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V
    .locals 2

    iget v0, p0, Lel$a;->h:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget v0, p0, Lel$a;->i:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iget v0, p0, Lel$a;->j:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iget v0, p0, Lel$a;->k:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iget v0, p0, Lel$a;->l:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iget v0, p0, Lel$a;->m:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iget v0, p0, Lel$a;->n:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iget v0, p0, Lel$a;->o:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iget v0, p0, Lel$a;->p:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iget v0, p0, Lel$a;->q:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iget v0, p0, Lel$a;->r:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iget v0, p0, Lel$a;->s:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iget v0, p0, Lel$a;->t:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iget v0, p0, Lel$a;->D:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->leftMargin:I

    iget v0, p0, Lel$a;->E:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->rightMargin:I

    iget v0, p0, Lel$a;->F:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->topMargin:I

    iget v0, p0, Lel$a;->G:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->bottomMargin:I

    iget v0, p0, Lel$a;->P:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->x:I

    iget v0, p0, Lel$a;->O:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->y:I

    iget v0, p0, Lel$a;->u:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iget v0, p0, Lel$a;->v:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iget v0, p0, Lel$a;->x:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iget v0, p0, Lel$a;->y:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iget v0, p0, Lel$a;->z:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget-object v0, p0, Lel$a;->w:Ljava/lang/String;

    iput-object v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iget v0, p0, Lel$a;->A:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iget v0, p0, Lel$a;->B:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iget v0, p0, Lel$a;->Q:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:F

    iget v0, p0, Lel$a;->R:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iget v0, p0, Lel$a;->T:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v0, p0, Lel$a;->S:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iget-boolean v0, p0, Lel$a;->ah:Z

    iput-boolean v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iget-boolean v0, p0, Lel$a;->ai:Z

    iput-boolean v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    iget v0, p0, Lel$a;->aj:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v0, p0, Lel$a;->ak:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v0, p0, Lel$a;->al:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v0, p0, Lel$a;->am:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:I

    iget v0, p0, Lel$a;->an:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v0, p0, Lel$a;->ao:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v0, p0, Lel$a;->ap:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iget v0, p0, Lel$a;->aq:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:F

    iget v0, p0, Lel$a;->C:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:I

    iget v0, p0, Lel$a;->g:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iget v0, p0, Lel$a;->e:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iget v0, p0, Lel$a;->f:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iget v0, p0, Lel$a;->b:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    iget v0, p0, Lel$a;->c:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    iget v0, p0, Lel$a;->I:I

    invoke-virtual {p1, v0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->setMarginStart(I)V

    iget v0, p0, Lel$a;->H:I

    invoke-virtual {p1, v0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->setMarginEnd(I)V

    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    return-void
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lel$a;

    invoke-direct {v0}, Lel$a;-><init>()V

    iget-boolean v1, p0, Lel$a;->a:Z

    iput-boolean v1, v0, Lel$a;->a:Z

    iget v1, p0, Lel$a;->b:I

    iput v1, v0, Lel$a;->b:I

    iget v1, p0, Lel$a;->c:I

    iput v1, v0, Lel$a;->c:I

    iget v1, p0, Lel$a;->e:I

    iput v1, v0, Lel$a;->e:I

    iget v1, p0, Lel$a;->f:I

    iput v1, v0, Lel$a;->f:I

    iget v1, p0, Lel$a;->g:F

    iput v1, v0, Lel$a;->g:F

    iget v1, p0, Lel$a;->h:I

    iput v1, v0, Lel$a;->h:I

    iget v1, p0, Lel$a;->i:I

    iput v1, v0, Lel$a;->i:I

    iget v1, p0, Lel$a;->j:I

    iput v1, v0, Lel$a;->j:I

    iget v1, p0, Lel$a;->k:I

    iput v1, v0, Lel$a;->k:I

    iget v1, p0, Lel$a;->l:I

    iput v1, v0, Lel$a;->l:I

    iget v1, p0, Lel$a;->m:I

    iput v1, v0, Lel$a;->m:I

    iget v1, p0, Lel$a;->n:I

    iput v1, v0, Lel$a;->n:I

    iget v1, p0, Lel$a;->o:I

    iput v1, v0, Lel$a;->o:I

    iget v1, p0, Lel$a;->p:I

    iput v1, v0, Lel$a;->p:I

    iget v1, p0, Lel$a;->q:I

    iput v1, v0, Lel$a;->q:I

    iget v1, p0, Lel$a;->r:I

    iput v1, v0, Lel$a;->r:I

    iget v1, p0, Lel$a;->s:I

    iput v1, v0, Lel$a;->s:I

    iget v1, p0, Lel$a;->t:I

    iput v1, v0, Lel$a;->t:I

    iget v1, p0, Lel$a;->u:F

    iput v1, v0, Lel$a;->u:F

    iget v1, p0, Lel$a;->v:F

    iput v1, v0, Lel$a;->v:F

    iget-object v1, p0, Lel$a;->w:Ljava/lang/String;

    iput-object v1, v0, Lel$a;->w:Ljava/lang/String;

    iget v1, p0, Lel$a;->A:I

    iput v1, v0, Lel$a;->A:I

    iget v1, p0, Lel$a;->B:I

    iput v1, v0, Lel$a;->B:I

    iget v1, p0, Lel$a;->u:F

    iput v1, v0, Lel$a;->u:F

    iget v1, p0, Lel$a;->u:F

    iput v1, v0, Lel$a;->u:F

    iget v1, p0, Lel$a;->u:F

    iput v1, v0, Lel$a;->u:F

    iget v1, p0, Lel$a;->u:F

    iput v1, v0, Lel$a;->u:F

    iget v1, p0, Lel$a;->u:F

    iput v1, v0, Lel$a;->u:F

    iget v1, p0, Lel$a;->C:I

    iput v1, v0, Lel$a;->C:I

    iget v1, p0, Lel$a;->D:I

    iput v1, v0, Lel$a;->D:I

    iget v1, p0, Lel$a;->E:I

    iput v1, v0, Lel$a;->E:I

    iget v1, p0, Lel$a;->F:I

    iput v1, v0, Lel$a;->F:I

    iget v1, p0, Lel$a;->G:I

    iput v1, v0, Lel$a;->G:I

    iget v1, p0, Lel$a;->H:I

    iput v1, v0, Lel$a;->H:I

    iget v1, p0, Lel$a;->I:I

    iput v1, v0, Lel$a;->I:I

    iget v1, p0, Lel$a;->J:I

    iput v1, v0, Lel$a;->J:I

    iget v1, p0, Lel$a;->K:I

    iput v1, v0, Lel$a;->K:I

    iget v1, p0, Lel$a;->L:I

    iput v1, v0, Lel$a;->L:I

    iget v1, p0, Lel$a;->M:I

    iput v1, v0, Lel$a;->M:I

    iget v1, p0, Lel$a;->N:I

    iput v1, v0, Lel$a;->N:I

    iget v1, p0, Lel$a;->O:I

    iput v1, v0, Lel$a;->O:I

    iget v1, p0, Lel$a;->P:I

    iput v1, v0, Lel$a;->P:I

    iget v1, p0, Lel$a;->Q:F

    iput v1, v0, Lel$a;->Q:F

    iget v1, p0, Lel$a;->R:F

    iput v1, v0, Lel$a;->R:F

    iget v1, p0, Lel$a;->S:I

    iput v1, v0, Lel$a;->S:I

    iget v1, p0, Lel$a;->T:I

    iput v1, v0, Lel$a;->T:I

    iget v1, p0, Lel$a;->U:F

    iput v1, v0, Lel$a;->U:F

    iget-boolean v1, p0, Lel$a;->V:Z

    iput-boolean v1, v0, Lel$a;->V:Z

    iget v1, p0, Lel$a;->W:F

    iput v1, v0, Lel$a;->W:F

    iget v1, p0, Lel$a;->X:F

    iput v1, v0, Lel$a;->X:F

    iget v1, p0, Lel$a;->Y:F

    iput v1, v0, Lel$a;->Y:F

    iget v1, p0, Lel$a;->Z:F

    iput v1, v0, Lel$a;->Z:F

    iget v1, p0, Lel$a;->aa:F

    iput v1, v0, Lel$a;->aa:F

    iget v1, p0, Lel$a;->ab:F

    iput v1, v0, Lel$a;->ab:F

    iget v1, p0, Lel$a;->ac:F

    iput v1, v0, Lel$a;->ac:F

    iget v1, p0, Lel$a;->ad:F

    iput v1, v0, Lel$a;->ad:F

    iget v1, p0, Lel$a;->ae:F

    iput v1, v0, Lel$a;->ae:F

    iget v1, p0, Lel$a;->af:F

    iput v1, v0, Lel$a;->af:F

    iget v1, p0, Lel$a;->ag:F

    iput v1, v0, Lel$a;->ag:F

    iget-boolean v1, p0, Lel$a;->ah:Z

    iput-boolean v1, v0, Lel$a;->ah:Z

    iget-boolean v1, p0, Lel$a;->ai:Z

    iput-boolean v1, v0, Lel$a;->ai:Z

    iget v1, p0, Lel$a;->aj:I

    iput v1, v0, Lel$a;->aj:I

    iget v1, p0, Lel$a;->ak:I

    iput v1, v0, Lel$a;->ak:I

    iget v1, p0, Lel$a;->al:I

    iput v1, v0, Lel$a;->al:I

    iget v1, p0, Lel$a;->am:I

    iput v1, v0, Lel$a;->am:I

    iget v1, p0, Lel$a;->an:I

    iput v1, v0, Lel$a;->an:I

    iget v1, p0, Lel$a;->ao:I

    iput v1, v0, Lel$a;->ao:I

    iget v1, p0, Lel$a;->ap:F

    iput v1, v0, Lel$a;->ap:F

    iget v1, p0, Lel$a;->aq:F

    iput v1, v0, Lel$a;->aq:F

    iget v1, p0, Lel$a;->ar:I

    iput v1, v0, Lel$a;->ar:I

    iget v1, p0, Lel$a;->as:I

    iput v1, v0, Lel$a;->as:I

    iget-object v1, p0, Lel$a;->at:[I

    if-eqz v1, :cond_0

    iget-object v1, p0, Lel$a;->at:[I

    iget-object v2, p0, Lel$a;->at:[I

    array-length v2, v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, v0, Lel$a;->at:[I

    :cond_0
    iget v1, p0, Lel$a;->x:I

    iput v1, v0, Lel$a;->x:I

    iget v1, p0, Lel$a;->y:I

    iput v1, v0, Lel$a;->y:I

    iget v1, p0, Lel$a;->z:F

    iput v1, v0, Lel$a;->z:F

    return-object v0
.end method
